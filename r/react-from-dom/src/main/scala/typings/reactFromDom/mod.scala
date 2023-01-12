package typings.reactFromDom

import typings.react.mod.ReactNode
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-from-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): ReactNode | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ReactNode | Node]
  inline def default(input: String, options: Options): ReactNode | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactNode | Node]
  inline def default(input: Node): ReactNode | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ReactNode | Node]
  inline def default(input: Node, options: Options): ReactNode | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactNode | Node]
  
  inline def convertFromNode(input: Node): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFromNode")(input.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def convertFromNode(input: Node, options: Options): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFromNode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def convertFromString(input: String): ReactNode | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFromString")(input.asInstanceOf[js.Any]).asInstanceOf[ReactNode | Node]
  inline def convertFromString(input: String, options: Options): ReactNode | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFromString")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactNode | Node]
  
  trait Action extends StObject {
    
    def condition(node: Node, key: String, level: Double): Boolean
    
    var post: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, ReactNode]] = js.undefined
    
    var pre: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, Node]] = js.undefined
  }
  object Action {
    
    inline def apply(condition: (Node, String, Double) => Boolean): Action = {
      val __obj = js.Dynamic.literal(condition = js.Any.fromFunction3(condition))
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: (Node, String, Double) => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction3(value))
      
      inline def setPost(value: (/* node */ Node, /* key */ String, /* level */ Double) => ReactNode): Self = StObject.set(x, "post", js.Any.fromFunction3(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(value: (/* node */ Node, /* key */ String, /* level */ Double) => Node): Self = StObject.set(x, "pre", js.Any.fromFunction3(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var nodeOnly: js.UndefOr[Boolean] = js.undefined
    
    var randomKey: js.UndefOr[Boolean] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setNodeOnly(value: Boolean): Self = StObject.set(x, "nodeOnly", value.asInstanceOf[js.Any])
      
      inline def setNodeOnlyUndefined: Self = StObject.set(x, "nodeOnly", js.undefined)
      
      inline def setRandomKey(value: Boolean): Self = StObject.set(x, "randomKey", value.asInstanceOf[js.Any])
      
      inline def setRandomKeyUndefined: Self = StObject.set(x, "randomKey", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
