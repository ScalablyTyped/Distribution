package typings.reactDashDom

import typings.react.reactMod.CElement
import typings.react.reactMod.ClassType
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.DOMElement
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.SFC
import typings.react.reactMod.SFCElement
import typings.reactDashDom.testDashUtilsMod.DebugPromiseLike
import typings.reactDashDom.testDashUtilsMod.MockedComponentClass
import typings.reactDashDom.testDashUtilsMod.ShallowRenderer
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactTestUtils extends js.Object {
  val Simulate: TypeofSimulate = js.native
  def act(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = js.native
  @JSName("act")
  def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def createRenderer(): ShallowRenderer = js.native
  def findAllInRenderedTree(root: Component[_, js.Object, _], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
  def findRenderedComponentWithType[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](root: Component[_, js.Object, _], `type`: ClassType[_, T, C]): T = js.native
  def findRenderedDOMComponentWithClass(root: Component[_, js.Object, _], className: String): Element = js.native
  def findRenderedDOMComponentWithTag(root: Component[_, js.Object, _], tagName: String): Element = js.native
  def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = js.native
  def isCompositeComponentWithType[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
  def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = js.native
  def isElement(element: js.Any): Boolean = js.native
  def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
  def isElementOfType[P](element: ReactElement, `type`: SFC[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
  def isElementOfType[P, T /* <: Component[P, js.Object, _] */, C /* <: ComponentClass[P, ComponentState] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
  @JSName("isElementOfType")
  def isElementOfType_P_DOMAttributesObjectT_Element[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
  def mockComponent(mocked: MockedComponentClass): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def mockComponent(mocked: MockedComponentClass, mockTagName: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def renderIntoDocument(element: SFCElement[_]): Unit = js.native
  def renderIntoDocument[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def renderIntoDocument[P](element: ReactElement): (Component[P, js.Object, _]) | Element | Unit = js.native
  def renderIntoDocument[P, T /* <: Component[P, js.Object, _] */](element: CElement[P, T]): T = js.native
  def scryRenderedComponentsWithType[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](root: Component[_, js.Object, _], `type`: ClassType[_, T, C]): js.Array[T] = js.native
  def scryRenderedDOMComponentsWithClass(root: Component[_, js.Object, _], className: String): js.Array[Element] = js.native
  def scryRenderedDOMComponentsWithTag(root: Component[_, js.Object, _], tagName: String): js.Array[Element] = js.native
}

