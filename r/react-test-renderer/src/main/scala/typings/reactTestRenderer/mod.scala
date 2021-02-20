package typings.reactTestRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.reactTestRenderer.anon.Deep
import typings.reactTestRenderer.reactTestRendererStrings.component
import typings.reactTestRenderer.reactTestRendererStrings.host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-test-renderer", "act")
  @js.native
  def act(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = js.native
  @JSImport("react-test-renderer", "act")
  @js.native
  def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("react-test-renderer", "create")
  @js.native
  def create(nextElement: ReactElement): ReactTestRenderer = js.native
  @JSImport("react-test-renderer", "create")
  @js.native
  def create(nextElement: ReactElement, options: TestRendererOptions): ReactTestRenderer = js.native
  
  @js.native
  trait DebugPromiseLike extends StObject {
    
    // the actual then() in here is 1-ary, but that doesn't count as a PromiseLike.
    def `then`(
      onfulfilled: js.Function1[/* value */ scala.Nothing, scala.Nothing],
      onrejected: js.Function1[/* reason */ scala.Nothing, scala.Nothing]
    ): scala.Nothing = js.native
  }
  object DebugPromiseLike {
    
    @scala.inline
    def apply(
      `then`: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
    ): DebugPromiseLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[DebugPromiseLike]
    }
    
    @scala.inline
    implicit class DebugPromiseLikeMutableBuilder[Self <: DebugPromiseLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThen(
        value: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
      ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ReactTestInstance extends StObject {
    
    var children: js.Array[ReactTestInstance | String] = js.native
    
    def find(predicate: js.Function1[/* node */ this.type, Boolean]): ReactTestInstance = js.native
    
    def findAll(predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[ReactTestInstance] = js.native
    def findAll(predicate: js.Function1[/* node */ this.type, Boolean], options: Deep): js.Array[ReactTestInstance] = js.native
    
    def findAllByProps(props: StringDictionary[js.Any]): js.Array[ReactTestInstance] = js.native
    def findAllByProps(props: StringDictionary[js.Any], options: Deep): js.Array[ReactTestInstance] = js.native
    
    def findAllByType(`type`: ElementType[_]): js.Array[ReactTestInstance] = js.native
    def findAllByType(`type`: ElementType[_], options: Deep): js.Array[ReactTestInstance] = js.native
    
    def findByProps(props: StringDictionary[js.Any]): ReactTestInstance = js.native
    
    def findByType(`type`: ElementType[_]): ReactTestInstance = js.native
    
    var instance: js.Any = js.native
    
    var parent: Null | ReactTestInstance = js.native
    
    var props: StringDictionary[js.Any] = js.native
    
    var `type`: ElementType[_] = js.native
  }
  
  @js.native
  trait ReactTestRenderer extends StObject {
    
    def getInstance(): Null | ReactTestInstance = js.native
    
    var root: ReactTestInstance = js.native
    
    def toJSON(): Null | ReactTestRendererJSON | js.Array[ReactTestRendererJSON] = js.native
    
    def toTree(): Null | ReactTestRendererTree = js.native
    
    def unmount(): Unit = js.native
    def unmount(nextElement: ReactElement): Unit = js.native
    
    def update(nextElement: ReactElement): Unit = js.native
  }
  
  @js.native
  trait ReactTestRendererJSON extends StObject {
    
    var children: Null | js.Array[ReactTestRendererNode] = js.native
    
    var props: StringDictionary[js.Any] = js.native
    
    var `type`: String = js.native
  }
  object ReactTestRendererJSON {
    
    @scala.inline
    def apply(props: StringDictionary[js.Any], `type`: String): ReactTestRendererJSON = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTestRendererJSON]
    }
    
    @scala.inline
    implicit class ReactTestRendererJSONMutableBuilder[Self <: ReactTestRendererJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactTestRendererNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenVarargs(value: ReactTestRendererNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactTestRendererNode = ReactTestRendererJSON | String
  
  @js.native
  trait ReactTestRendererTree extends ReactTestRendererJSON {
    
    var instance: js.Any = js.native
    
    var nodeType: component | host = js.native
    
    var rendered: Null | ReactTestRendererTree | js.Array[ReactTestRendererTree] = js.native
  }
  object ReactTestRendererTree {
    
    @scala.inline
    def apply(instance: js.Any, nodeType: component | host, props: StringDictionary[js.Any], `type`: String): ReactTestRendererTree = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTestRendererTree]
    }
    
    @scala.inline
    implicit class ReactTestRendererTreeMutableBuilder[Self <: ReactTestRendererTree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeType(value: component | host): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendered(value: ReactTestRendererTree | js.Array[ReactTestRendererTree]): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedNull: Self = StObject.set(x, "rendered", null)
      
      @scala.inline
      def setRenderedVarargs(value: ReactTestRendererTree*): Self = StObject.set(x, "rendered", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TestRendererOptions extends StObject {
    
    def createNodeMock(element: ReactElement): js.Any = js.native
  }
  object TestRendererOptions {
    
    @scala.inline
    def apply(createNodeMock: ReactElement => js.Any): TestRendererOptions = {
      val __obj = js.Dynamic.literal(createNodeMock = js.Any.fromFunction1(createNodeMock))
      __obj.asInstanceOf[TestRendererOptions]
    }
    
    @scala.inline
    implicit class TestRendererOptionsMutableBuilder[Self <: TestRendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateNodeMock(value: ReactElement => js.Any): Self = StObject.set(x, "createNodeMock", js.Any.fromFunction1(value))
    }
  }
}
