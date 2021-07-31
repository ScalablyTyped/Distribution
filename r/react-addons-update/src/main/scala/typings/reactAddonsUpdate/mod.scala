package typings.reactAddonsUpdate

import org.scalablytyped.runtime.StringDictionary
import typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateArraySpec
import typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: js.Array[js.Any], spec: UpdateArraySpec): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def apply(value: js.Object, spec: UpdateSpec): js.Any = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("react-addons-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object reactAugmentingMod {
    
    object Addons {
      
      @JSImport("react", "__Addons")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def update(value: js.Array[js.Any], spec: UpdateArraySpec): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(value.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
      @scala.inline
      def update(value: js.Object, spec: UpdateSpec): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(value.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    trait UpdateArraySpec
      extends StObject
         with UpdateSpecCommand {
      
      @JSName("$push")
      var $push: js.UndefOr[js.Array[js.Any]] = js.undefined
      
      @JSName("$splice")
      var $splice: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
      
      @JSName("$unshift")
      var $unshift: js.UndefOr[js.Array[js.Any]] = js.undefined
    }
    object UpdateArraySpec {
      
      @scala.inline
      def apply(): UpdateArraySpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateArraySpec]
      }
      
      @scala.inline
      implicit class UpdateArraySpecMutableBuilder[Self <: UpdateArraySpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$push(value: js.Array[js.Any]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$pushUndefined: Self = StObject.set(x, "$push", js.undefined)
        
        @scala.inline
        def set$pushVarargs(value: js.Any*): Self = StObject.set(x, "$push", js.Array(value :_*))
        
        @scala.inline
        def set$splice(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "$splice", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$spliceUndefined: Self = StObject.set(x, "$splice", js.undefined)
        
        @scala.inline
        def set$spliceVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "$splice", js.Array(value :_*))
        
        @scala.inline
        def set$unshift(value: js.Array[js.Any]): Self = StObject.set(x, "$unshift", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$unshiftUndefined: Self = StObject.set(x, "$unshift", js.undefined)
        
        @scala.inline
        def set$unshiftVarargs(value: js.Any*): Self = StObject.set(x, "$unshift", js.Array(value :_*))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - js.Array[js.Array[scala.Double]]
      - typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateSpecCommand
      - typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateSpecPath
    */
    type UpdateSpec = _UpdateSpec | js.Array[js.Array[Double]]
    
    trait UpdateSpecCommand
      extends StObject
         with _UpdateSpec {
      
      @JSName("$apply")
      var $apply: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
      
      @JSName("$merge")
      var $merge: js.UndefOr[js.Object] = js.undefined
      
      @JSName("$set")
      var $set: js.UndefOr[js.Any] = js.undefined
    }
    object UpdateSpecCommand {
      
      @scala.inline
      def apply(): UpdateSpecCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateSpecCommand]
      }
      
      @scala.inline
      implicit class UpdateSpecCommandMutableBuilder[Self <: UpdateSpecCommand] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$apply(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "$apply", js.Any.fromFunction1(value))
        
        @scala.inline
        def set$applyUndefined: Self = StObject.set(x, "$apply", js.undefined)
        
        @scala.inline
        def set$merge(value: js.Object): Self = StObject.set(x, "$merge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$mergeUndefined: Self = StObject.set(x, "$merge", js.undefined)
        
        @scala.inline
        def set$set(value: js.Any): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$setUndefined: Self = StObject.set(x, "$set", js.undefined)
      }
    }
    
    trait UpdateSpecPath
      extends StObject
         with /* key */ StringDictionary[UpdateSpec]
         with _UpdateSpec
    object UpdateSpecPath {
      
      @scala.inline
      def apply(): UpdateSpecPath = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateSpecPath]
      }
    }
    
    trait _UpdateSpec extends StObject
    object _UpdateSpec {
      
      @scala.inline
      def UpdateSpecCommand(): typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateSpecCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateSpecCommand]
      }
      
      @scala.inline
      def UpdateSpecPath(): typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateSpecPath = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.reactAddonsUpdate.mod.reactAugmentingMod.UpdateSpecPath]
      }
    }
  }
}
