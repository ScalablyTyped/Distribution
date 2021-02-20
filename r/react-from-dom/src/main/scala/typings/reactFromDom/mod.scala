package typings.reactFromDom

import typings.react.mod.ReactNode
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-from-dom", JSImport.Default)
  @js.native
  def default(input: String): ReactNode | Node = js.native
  @JSImport("react-from-dom", JSImport.Default)
  @js.native
  def default(input: String, options: Options): ReactNode | Node = js.native
  @JSImport("react-from-dom", JSImport.Default)
  @js.native
  def default(input: Node): ReactNode | Node = js.native
  @JSImport("react-from-dom", JSImport.Default)
  @js.native
  def default(input: Node, options: Options): ReactNode | Node = js.native
  
  @JSImport("react-from-dom", "convertFromNode")
  @js.native
  def convertFromNode(input: Node): ReactNode = js.native
  @JSImport("react-from-dom", "convertFromNode")
  @js.native
  def convertFromNode(input: Node, options: Options): ReactNode = js.native
  
  @JSImport("react-from-dom", "convertFromString")
  @js.native
  def convertFromString(input: String): ReactNode | Node = js.native
  @JSImport("react-from-dom", "convertFromString")
  @js.native
  def convertFromString(input: String, options: Options): ReactNode | Node = js.native
  
  @js.native
  trait Action extends StObject {
    
    def condition(node: Node, key: String, level: Double): Boolean = js.native
    
    var post: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, ReactNode]] = js.native
    
    var pre: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, Node]] = js.native
  }
  object Action {
    
    @scala.inline
    def apply(condition: (Node, String, Double) => Boolean): Action = {
      val __obj = js.Dynamic.literal(condition = js.Any.fromFunction3(condition))
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: (Node, String, Double) => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPost(value: (/* node */ Node, /* key */ String, /* level */ Double) => ReactNode): Self = StObject.set(x, "post", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPre(value: (/* node */ Node, /* key */ String, /* level */ Double) => Node): Self = StObject.set(x, "pre", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var level: js.UndefOr[Double] = js.native
    
    var nodeOnly: js.UndefOr[Boolean] = js.native
    
    var selector: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setNodeOnly(value: Boolean): Self = StObject.set(x, "nodeOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeOnlyUndefined: Self = StObject.set(x, "nodeOnly", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
