package typings.reactAddonsPerf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-addons-perf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExclusive(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExclusive")().asInstanceOf[Any]
  inline def getExclusive(measurements: js.Array[Measurements]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExclusive")(measurements.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getInclusive(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInclusive")().asInstanceOf[Any]
  inline def getInclusive(measurements: js.Array[Measurements]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInclusive")(measurements.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getLastMeasurements(): js.Array[Measurements] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastMeasurements")().asInstanceOf[js.Array[Measurements]]
  
  inline def getOperations(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOperations")().asInstanceOf[Any]
  inline def getOperations(measurements: js.Array[Measurements]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOperations")(measurements.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getWasted(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getWasted")().asInstanceOf[Any]
  inline def getWasted(measurements: js.Array[Measurements]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getWasted")(measurements.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def printDOM(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printDOM")().asInstanceOf[Unit]
  inline def printDOM(measurements: js.Array[Measurements]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printDOM")(measurements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printExclusive(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printExclusive")().asInstanceOf[Unit]
  inline def printExclusive(measurements: js.Array[Measurements]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printExclusive")(measurements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printInclusive(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printInclusive")().asInstanceOf[Unit]
  inline def printInclusive(measurements: js.Array[Measurements]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printInclusive")(measurements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printOperations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printOperations")().asInstanceOf[Unit]
  inline def printOperations(measurements: js.Array[Measurements]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printOperations")(measurements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printWasted(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printWasted")().asInstanceOf[Unit]
  inline def printWasted(measurements: js.Array[Measurements]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printWasted")(measurements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  trait ComponentPerfContext extends StObject {
    
    var current: String
    
    var owner: String
  }
  object ComponentPerfContext {
    
    inline def apply(current: String, owner: String): ComponentPerfContext = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentPerfContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentPerfContext] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    }
  }
  
  trait Measurements extends StObject {
    
    var counts: NumericPerfContext
    
    var displayNames: StringDictionary[ComponentPerfContext]
    
    var exclusive: NumericPerfContext
    
    var inclusive: NumericPerfContext
    
    var render: NumericPerfContext
    
    var totalTime: Double
    
    var writes: NumericPerfContext
  }
  object Measurements {
    
    inline def apply(
      counts: NumericPerfContext,
      displayNames: StringDictionary[ComponentPerfContext],
      exclusive: NumericPerfContext,
      inclusive: NumericPerfContext,
      render: NumericPerfContext,
      totalTime: Double,
      writes: NumericPerfContext
    ): Measurements = {
      val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], writes = writes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Measurements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Measurements] (val x: Self) extends AnyVal {
      
      inline def setCounts(value: NumericPerfContext): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
      
      inline def setDisplayNames(value: StringDictionary[ComponentPerfContext]): Self = StObject.set(x, "displayNames", value.asInstanceOf[js.Any])
      
      inline def setExclusive(value: NumericPerfContext): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setInclusive(value: NumericPerfContext): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setRender(value: NumericPerfContext): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
      
      inline def setWrites(value: NumericPerfContext): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    }
  }
  
  type NumericPerfContext = StringDictionary[Double]
}
