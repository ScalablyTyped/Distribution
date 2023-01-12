package typings.reactTestRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.reactTestRenderer.anon.Deep
import typings.reactTestRenderer.anon.UNDEFINEDVOIDONLY
import typings.reactTestRenderer.reactTestRendererStrings.component
import typings.reactTestRenderer.reactTestRendererStrings.host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-test-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def act(callback: js.Function0[VoidOrUndefinedOnly]): DebugPromiseLike = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[DebugPromiseLike]
  
  inline def act_Promise(callback: js.Function0[js.Promise[VoidOrUndefinedOnly]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def create(nextElement: ReactElement): ReactTestRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(nextElement.asInstanceOf[js.Any]).asInstanceOf[ReactTestRenderer]
  inline def create(nextElement: ReactElement, options: TestRendererOptions): ReactTestRenderer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nextElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactTestRenderer]
  
  trait DebugPromiseLike extends StObject {
    
    // the actual then() in here is 1-ary, but that doesn't count as a PromiseLike.
    def `then`(
      onfulfilled: js.Function1[/* value */ scala.Nothing, scala.Nothing],
      onrejected: js.Function1[/* reason */ scala.Nothing, scala.Nothing]
    ): scala.Nothing
  }
  object DebugPromiseLike {
    
    inline def apply(
      `then`: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
    ): DebugPromiseLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[DebugPromiseLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugPromiseLike] (val x: Self) extends AnyVal {
      
      inline def setThen(
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
    
    def findAllByProps(props: StringDictionary[Any]): js.Array[ReactTestInstance] = js.native
    def findAllByProps(props: StringDictionary[Any], options: Deep): js.Array[ReactTestInstance] = js.native
    
    def findAllByType(`type`: ElementType[Any]): js.Array[ReactTestInstance] = js.native
    def findAllByType(`type`: ElementType[Any], options: Deep): js.Array[ReactTestInstance] = js.native
    
    def findByProps(props: StringDictionary[Any]): ReactTestInstance = js.native
    
    def findByType(`type`: ElementType[Any]): ReactTestInstance = js.native
    
    var instance: Any = js.native
    
    var parent: Null | ReactTestInstance = js.native
    
    var props: StringDictionary[Any] = js.native
    
    var `type`: ElementType[Any] = js.native
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
  
  trait ReactTestRendererJSON extends StObject {
    
    var children: Null | js.Array[ReactTestRendererNode]
    
    var props: StringDictionary[Any]
    
    var `type`: String
  }
  object ReactTestRendererJSON {
    
    inline def apply(props: StringDictionary[Any], `type`: String): ReactTestRendererJSON = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], children = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTestRendererJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactTestRendererJSON] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ReactTestRendererNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: ReactTestRendererNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setProps(value: StringDictionary[Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactTestRendererNode = ReactTestRendererJSON | String
  
  trait ReactTestRendererTree
    extends StObject
       with ReactTestRendererJSON {
    
    var instance: Any
    
    var nodeType: component | host
    
    var rendered: Null | ReactTestRendererTree | js.Array[ReactTestRendererTree]
  }
  object ReactTestRendererTree {
    
    inline def apply(instance: Any, nodeType: component | host, props: StringDictionary[Any], `type`: String): ReactTestRendererTree = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], children = null, rendered = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTestRendererTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactTestRendererTree] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: component | host): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setRendered(value: ReactTestRendererTree | js.Array[ReactTestRendererTree]): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      inline def setRenderedNull: Self = StObject.set(x, "rendered", null)
      
      inline def setRenderedVarargs(value: ReactTestRendererTree*): Self = StObject.set(x, "rendered", js.Array(value*))
    }
  }
  
  trait TestRendererOptions extends StObject {
    
    def createNodeMock(element: ReactElement): Any
  }
  object TestRendererOptions {
    
    inline def apply(createNodeMock: ReactElement => Any): TestRendererOptions = {
      val __obj = js.Dynamic.literal(createNodeMock = js.Any.fromFunction1(createNodeMock))
      __obj.asInstanceOf[TestRendererOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestRendererOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateNodeMock(value: ReactElement => Any): Self = StObject.set(x, "createNodeMock", js.Any.fromFunction1(value))
    }
  }
  
  // tslint:disable-next-line: void-return
  type VoidOrUndefinedOnly = Unit | UNDEFINEDVOIDONLY
}
