package typings.rrdtool

import typings.rrdtool.mod.ConsolidationFunction
import typings.rrdtool.mod.DataSourceType
import typings.rrdtool.mod.DataSourceType_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rrdtoolStrings {
  
  @js.native
  sealed trait ABSOLUTE
    extends StObject
       with DataSourceType
       with DataSourceType_
  inline def ABSOLUTE: ABSOLUTE = "ABSOLUTE".asInstanceOf[ABSOLUTE]
  
  @js.native
  sealed trait AVERAGE
    extends StObject
       with ConsolidationFunction
  inline def AVERAGE: AVERAGE = "AVERAGE".asInstanceOf[AVERAGE]
  
  @js.native
  sealed trait COMPUTE
    extends StObject
       with DataSourceType
  inline def COMPUTE: COMPUTE = "COMPUTE".asInstanceOf[COMPUTE]
  
  @js.native
  sealed trait COUNTER
    extends StObject
       with DataSourceType
       with DataSourceType_
  inline def COUNTER: COUNTER = "COUNTER".asInstanceOf[COUNTER]
  
  @js.native
  sealed trait DCOUNTER
    extends StObject
       with DataSourceType
       with DataSourceType_
  inline def DCOUNTER: DCOUNTER = "DCOUNTER".asInstanceOf[DCOUNTER]
  
  @js.native
  sealed trait DDERIVE
    extends StObject
       with DataSourceType
       with DataSourceType_
  inline def DDERIVE: DDERIVE = "DDERIVE".asInstanceOf[DDERIVE]
  
  @js.native
  sealed trait DERIVE
    extends StObject
       with DataSourceType
       with DataSourceType_
  inline def DERIVE: DERIVE = "DERIVE".asInstanceOf[DERIVE]
  
  @js.native
  sealed trait GAUGE
    extends StObject
       with DataSourceType
       with DataSourceType_
  inline def GAUGE: GAUGE = "GAUGE".asInstanceOf[GAUGE]
  
  @js.native
  sealed trait LAST
    extends StObject
       with ConsolidationFunction
  inline def LAST: LAST = "LAST".asInstanceOf[LAST]
  
  @js.native
  sealed trait MAX
    extends StObject
       with ConsolidationFunction
  inline def MAX: MAX = "MAX".asInstanceOf[MAX]
  
  @js.native
  sealed trait MIN
    extends StObject
       with ConsolidationFunction
  inline def MIN: MIN = "MIN".asInstanceOf[MIN]
}
