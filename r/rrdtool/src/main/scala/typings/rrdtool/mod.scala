package typings.rrdtool

import typings.rrdtool.anon.Force
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rrdtool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[D /* <: RrdtoolData */](file: String, opts: Force, args: js.Array[RrdtoolArgument[D]]): RrdtoolDatabase[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RrdtoolDatabase[D]]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def open(file: String): RrdtoolDatabase[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[RrdtoolDatabase[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrdtool.rrdtoolStrings.AVERAGE
    - typings.rrdtool.rrdtoolStrings.MIN
    - typings.rrdtool.rrdtoolStrings.MAX
    - typings.rrdtool.rrdtoolStrings.LAST
  */
  trait ConsolidationFunction extends StObject
  object ConsolidationFunction {
    
    inline def AVERAGE: typings.rrdtool.rrdtoolStrings.AVERAGE = "AVERAGE".asInstanceOf[typings.rrdtool.rrdtoolStrings.AVERAGE]
    
    inline def LAST: typings.rrdtool.rrdtoolStrings.LAST = "LAST".asInstanceOf[typings.rrdtool.rrdtoolStrings.LAST]
    
    inline def MAX: typings.rrdtool.rrdtoolStrings.MAX = "MAX".asInstanceOf[typings.rrdtool.rrdtoolStrings.MAX]
    
    inline def MIN: typings.rrdtool.rrdtoolStrings.MIN = "MIN".asInstanceOf[typings.rrdtool.rrdtoolStrings.MIN]
  }
  
  type DataSource[D /* <: RrdtoolData */] = DataSource_[D] | DataSourceCompute[D]
  
  // XXX: Enhance rpn-expression type
  // DS:ds-name:COMPUTE:rpn-expression
  type DataSourceCompute[D /* <: RrdtoolData */] = /* template literal string: DS:${keyofD&string}:COMPUTE:${string} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrdtool.rrdtoolStrings.COMPUTE
    - typings.rrdtool.rrdtoolStrings.GAUGE
    - typings.rrdtool.rrdtoolStrings.COUNTER
    - typings.rrdtool.rrdtoolStrings.DCOUNTER
    - typings.rrdtool.rrdtoolStrings.DERIVE
    - typings.rrdtool.rrdtoolStrings.DDERIVE
    - typings.rrdtool.rrdtoolStrings.ABSOLUTE
  */
  trait DataSourceType extends StObject
  object DataSourceType {
    
    inline def ABSOLUTE: typings.rrdtool.rrdtoolStrings.ABSOLUTE = "ABSOLUTE".asInstanceOf[typings.rrdtool.rrdtoolStrings.ABSOLUTE]
    
    inline def COMPUTE: typings.rrdtool.rrdtoolStrings.COMPUTE = "COMPUTE".asInstanceOf[typings.rrdtool.rrdtoolStrings.COMPUTE]
    
    inline def COUNTER: typings.rrdtool.rrdtoolStrings.COUNTER = "COUNTER".asInstanceOf[typings.rrdtool.rrdtoolStrings.COUNTER]
    
    inline def DCOUNTER: typings.rrdtool.rrdtoolStrings.DCOUNTER = "DCOUNTER".asInstanceOf[typings.rrdtool.rrdtoolStrings.DCOUNTER]
    
    inline def DDERIVE: typings.rrdtool.rrdtoolStrings.DDERIVE = "DDERIVE".asInstanceOf[typings.rrdtool.rrdtoolStrings.DDERIVE]
    
    inline def DERIVE: typings.rrdtool.rrdtoolStrings.DERIVE = "DERIVE".asInstanceOf[typings.rrdtool.rrdtoolStrings.DERIVE]
    
    inline def GAUGE: typings.rrdtool.rrdtoolStrings.GAUGE = "GAUGE".asInstanceOf[typings.rrdtool.rrdtoolStrings.GAUGE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrdtool.rrdtoolStrings.GAUGE
    - typings.rrdtool.rrdtoolStrings.COUNTER
    - typings.rrdtool.rrdtoolStrings.DCOUNTER
    - typings.rrdtool.rrdtoolStrings.DERIVE
    - typings.rrdtool.rrdtoolStrings.DDERIVE
    - typings.rrdtool.rrdtoolStrings.ABSOLUTE
  */
  trait DataSourceType_ extends StObject
  object DataSourceType_ {
    
    inline def ABSOLUTE: typings.rrdtool.rrdtoolStrings.ABSOLUTE = "ABSOLUTE".asInstanceOf[typings.rrdtool.rrdtoolStrings.ABSOLUTE]
    
    inline def COUNTER: typings.rrdtool.rrdtoolStrings.COUNTER = "COUNTER".asInstanceOf[typings.rrdtool.rrdtoolStrings.COUNTER]
    
    inline def DCOUNTER: typings.rrdtool.rrdtoolStrings.DCOUNTER = "DCOUNTER".asInstanceOf[typings.rrdtool.rrdtoolStrings.DCOUNTER]
    
    inline def DDERIVE: typings.rrdtool.rrdtoolStrings.DDERIVE = "DDERIVE".asInstanceOf[typings.rrdtool.rrdtoolStrings.DDERIVE]
    
    inline def DERIVE: typings.rrdtool.rrdtoolStrings.DERIVE = "DERIVE".asInstanceOf[typings.rrdtool.rrdtoolStrings.DERIVE]
    
    inline def GAUGE: typings.rrdtool.rrdtoolStrings.GAUGE = "GAUGE".asInstanceOf[typings.rrdtool.rrdtoolStrings.GAUGE]
  }
  
  // DS:ds-name:{GAUGE | COUNTER | DERIVE | DCOUNTER | DDERIVE | ABSOLUTE}:heartbeat:min:max
  type DataSource_[D /* <: RrdtoolData */] = /* template literal string: DS:${keyofD&string}:${DataSourceType_}:${Duration}:${number}:${number} */ String
  
  type Duration = Double | (/* template literal string: ${number}${s|m|h|d|w|M|y} */ String)
  
  // XXX: Not really correct, this would be better but does not work correctly (?):
  // (error: Error, data: undefined) => void | ((error: null, data: Array<DataPoint<A>>) => void)
  type FetchCallback[D /* <: RrdtoolData */] = js.Function2[/* error */ js.Error, /* data */ js.Array[RrdtoolDataPoint[D]], Unit]
  
  type RoundRobinArchive = RoundRobinArchive_ | RoundRobinArchiveHWPredict | RoundRobinArchiveSeasonal | RoundRobinArchiveDevPredict | RoundRobinArchiveFailures
  
  // RRA:DEVPREDICT:rows:rra-num
  type RoundRobinArchiveDevPredict = /* template literal string: RRA:DEVPREDICT:${Duration}:${number} */ String
  
  // RRA:FAILURES:rows:threshold:window length:rra-num
  type RoundRobinArchiveFailures = /* template literal string: RRA:FAILURES:${Duration}:${number}:${number}:${number} */ String
  
  // RRA:{HWPREDICT | MHWPREDICT}:rows:alpha:beta:seasonal period[:rra-num]
  type RoundRobinArchiveHWPredict = /* template literal string: RRA:${HWPREDICT|MHWPREDICT}:${Duration}:${number}:${number}:${Duration}${||:${number}} */ String
  
  // RRA:{SEASONAL | DEVSEASONAL}:seasonal period:gamma:rra-num[:smoothing-window]
  type RoundRobinArchiveSeasonal = /* template literal string: RRA:${SEASONAL|DEVSEASONAL}:${Duration}:${number}:${number}${||:${number}} */ String
  
  // RRA:{AVERAGE | MIN | MAX | LAST}:xff:steps:rows
  type RoundRobinArchive_ = /* template literal string: RRA:${ConsolidationFunction}:${number}:${Duration}:${Duration} */ String
  
  type RrdtoolArgument[D /* <: RrdtoolData */] = DataSource[D] | RoundRobinArchive
  
  type RrdtoolData = Record[String, Double]
  
  trait RrdtoolDataPoint[D /* <: RrdtoolData */] extends StObject {
    
    var time: Timestamp
    
    var values: D
  }
  object RrdtoolDataPoint {
    
    inline def apply[D /* <: RrdtoolData */](time: Timestamp, values: D): RrdtoolDataPoint[D] = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RrdtoolDataPoint[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RrdtoolDataPoint[?], D /* <: RrdtoolData */] (val x: Self & RrdtoolDataPoint[D]) extends AnyVal {
      
      inline def setTime(value: Timestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setValues(value: D): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RrdtoolDatabase[D /* <: RrdtoolData */] extends StObject {
    
    def fetch(cf: ConsolidationFunction, start: Timestamp, stop: Timestamp, cb: FetchCallback[D]): Unit = js.native
    /**
      * Fetch a span of data from the database.
      */
    def fetch(cf: ConsolidationFunction, start: Timestamp, stop: Timestamp, res: Double, cb: FetchCallback[D]): Unit = js.native
    
    /**
      * Insert data into the database.
      */
    def update(ts: Timestamp, values: Partial[D]): Unit = js.native
    def update(ts: Timestamp, values: Partial[D], cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def update(values: D): Unit = js.native
    def update(values: D, cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
  
  type Timestamp = Double
}
