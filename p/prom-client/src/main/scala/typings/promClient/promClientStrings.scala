package typings.promClient

import typings.promClient.mod.Aggregator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promClientStrings {
  
  @js.native
  sealed trait average
    extends StObject
       with Aggregator
  inline def average: average = "average".asInstanceOf[average]
  
  @js.native
  sealed trait first
    extends StObject
       with Aggregator
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait max
    extends StObject
       with Aggregator
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait min
    extends StObject
       with Aggregator
  inline def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait omit
    extends StObject
       with Aggregator
  inline def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait sum
    extends StObject
       with Aggregator
  inline def sum: sum = "sum".asInstanceOf[sum]
}
