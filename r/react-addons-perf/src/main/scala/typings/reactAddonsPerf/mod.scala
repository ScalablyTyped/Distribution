package typings.reactAddonsPerf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-addons-perf", "getExclusive")
  @js.native
  def getExclusive(): js.Any = js.native
  @JSImport("react-addons-perf", "getExclusive")
  @js.native
  def getExclusive(measurements: js.Array[Measurements]): js.Any = js.native
  
  @JSImport("react-addons-perf", "getInclusive")
  @js.native
  def getInclusive(): js.Any = js.native
  @JSImport("react-addons-perf", "getInclusive")
  @js.native
  def getInclusive(measurements: js.Array[Measurements]): js.Any = js.native
  
  @JSImport("react-addons-perf", "getLastMeasurements")
  @js.native
  def getLastMeasurements(): js.Array[Measurements] = js.native
  
  @JSImport("react-addons-perf", "getOperations")
  @js.native
  def getOperations(): js.Any = js.native
  @JSImport("react-addons-perf", "getOperations")
  @js.native
  def getOperations(measurements: js.Array[Measurements]): js.Any = js.native
  
  @JSImport("react-addons-perf", "getWasted")
  @js.native
  def getWasted(): js.Any = js.native
  @JSImport("react-addons-perf", "getWasted")
  @js.native
  def getWasted(measurements: js.Array[Measurements]): js.Any = js.native
  
  @JSImport("react-addons-perf", "printDOM")
  @js.native
  def printDOM(): Unit = js.native
  @JSImport("react-addons-perf", "printDOM")
  @js.native
  def printDOM(measurements: js.Array[Measurements]): Unit = js.native
  
  @JSImport("react-addons-perf", "printExclusive")
  @js.native
  def printExclusive(): Unit = js.native
  @JSImport("react-addons-perf", "printExclusive")
  @js.native
  def printExclusive(measurements: js.Array[Measurements]): Unit = js.native
  
  @JSImport("react-addons-perf", "printInclusive")
  @js.native
  def printInclusive(): Unit = js.native
  @JSImport("react-addons-perf", "printInclusive")
  @js.native
  def printInclusive(measurements: js.Array[Measurements]): Unit = js.native
  
  @JSImport("react-addons-perf", "printOperations")
  @js.native
  def printOperations(): Unit = js.native
  @JSImport("react-addons-perf", "printOperations")
  @js.native
  def printOperations(measurements: js.Array[Measurements]): Unit = js.native
  
  @JSImport("react-addons-perf", "printWasted")
  @js.native
  def printWasted(): Unit = js.native
  @JSImport("react-addons-perf", "printWasted")
  @js.native
  def printWasted(measurements: js.Array[Measurements]): Unit = js.native
  
  @JSImport("react-addons-perf", "start")
  @js.native
  def start(): Unit = js.native
  
  @JSImport("react-addons-perf", "stop")
  @js.native
  def stop(): Unit = js.native
  
  @js.native
  trait ComponentPerfContext extends StObject {
    
    var current: String = js.native
    
    var owner: String = js.native
  }
  object ComponentPerfContext {
    
    @scala.inline
    def apply(current: String, owner: String): ComponentPerfContext = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentPerfContext]
    }
    
    @scala.inline
    implicit class ComponentPerfContextMutableBuilder[Self <: ComponentPerfContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Measurements extends StObject {
    
    var counts: NumericPerfContext = js.native
    
    var displayNames: StringDictionary[ComponentPerfContext] = js.native
    
    var exclusive: NumericPerfContext = js.native
    
    var inclusive: NumericPerfContext = js.native
    
    var render: NumericPerfContext = js.native
    
    var totalTime: Double = js.native
    
    var writes: NumericPerfContext = js.native
  }
  object Measurements {
    
    @scala.inline
    def apply(
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
    implicit class MeasurementsMutableBuilder[Self <: Measurements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounts(value: NumericPerfContext): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNames(value: StringDictionary[ComponentPerfContext]): Self = StObject.set(x, "displayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusive(value: NumericPerfContext): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusive(value: NumericPerfContext): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: NumericPerfContext): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrites(value: NumericPerfContext): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    }
  }
  
  type NumericPerfContext = StringDictionary[Double]
}
