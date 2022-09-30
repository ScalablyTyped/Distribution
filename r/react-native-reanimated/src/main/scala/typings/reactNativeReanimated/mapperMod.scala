package typings.reactNativeReanimated

import typings.reactNativeReanimated.jsReanimatedCommonTypesMod.JSReanimated
import typings.reactNativeReanimated.reanimated2CommonTypesMod.NestedObjectValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapperMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/Mapper", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Mapper[T] {
    def this(module: JSReanimated, mapper: js.Function0[Unit]) = this()
    def this(
      module: JSReanimated,
      mapper: js.Function0[Unit],
      inputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[T]]]
    ) = this()
    def this(
      module: JSReanimated,
      mapper: js.Function0[Unit],
      inputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[T]]],
      outputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[T]]]
    ) = this()
    def this(
      module: JSReanimated,
      mapper: js.Function0[Unit],
      inputs: Unit,
      outputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[T]]]
    ) = this()
    
    /* CompleteClass */
    var dirty: Boolean = js.native
    
    /* CompleteClass */
    override def execute(): Unit = js.native
    
    /* CompleteClass */
    override def extractMutablesFromArray[T](array: NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[T]]): js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]] = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var inputs: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]] = js.native
    
    /* CompleteClass */
    override def mapper(): Unit = js.native
    
    /* CompleteClass */
    var outputs: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/Mapper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/Mapper", "default.MAPPER_ID")
    @js.native
    def MAPPER_ID: Double = js.native
    inline def MAPPER_ID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAPPER_ID")(x.asInstanceOf[js.Any])
  }
  
  trait Mapper[T] extends StObject {
    
    var dirty: Boolean
    
    def execute(): Unit
    
    def extractMutablesFromArray[T](array: NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[T]]): js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]]
    
    var id: Double
    
    var inputs: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]]
    
    def mapper(): Unit
    
    var outputs: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]]
  }
  object Mapper {
    
    inline def apply[T](
      dirty: Boolean,
      execute: () => Unit,
      extractMutablesFromArray: NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[Any]] => js.Array[typings.reactNativeReanimated.mutableValueMod.default[Any]],
      id: Double,
      inputs: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]],
      mapper: () => Unit,
      outputs: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]]
    ): Mapper[T] = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), extractMutablesFromArray = js.Any.fromFunction1(extractMutablesFromArray), id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], mapper = js.Any.fromFunction0(mapper), outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapper[T]]
    }
    
    extension [Self <: Mapper[?], T](x: Self & Mapper[T]) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setExtractMutablesFromArray(
        value: NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[Any]] => js.Array[typings.reactNativeReanimated.mutableValueMod.default[Any]]
      ): Self = StObject.set(x, "extractMutablesFromArray", js.Any.fromFunction1(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: typings.reactNativeReanimated.mutableValueMod.default[T]*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setMapper(value: () => Unit): Self = StObject.set(x, "mapper", js.Any.fromFunction0(value))
      
      inline def setOutputs(value: js.Array[typings.reactNativeReanimated.mutableValueMod.default[T]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: typings.reactNativeReanimated.mutableValueMod.default[T]*): Self = StObject.set(x, "outputs", js.Array(value*))
    }
  }
}
