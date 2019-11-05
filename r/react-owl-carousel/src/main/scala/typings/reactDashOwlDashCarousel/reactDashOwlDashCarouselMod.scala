package typings.reactDashOwlDashCarousel

import typings.jquery.JQuery
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.Component
import typings.reactDashOwlDashCarousel.reactDashOwlDashCarouselMod.ComponentProps
import typings.reactDashOwlDashCarousel.reactDashOwlDashCarouselMod.OwlCarouselProps
import typings.reactDashOwlDashCarousel.reactDashOwlDashCarouselMod.ReactOwlCarousel
import typings.reactDashOwlDashCarousel.umdOptionsMod.Options
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-owl-carousel", JSImport.Namespace)
@js.native
object reactDashOwlDashCarouselMod extends js.Object {
  @js.native
  trait ReactOwlCarousel
    extends Component[OwlCarouselProps, js.Object, js.Any] {
    @JSName("$ele")
    var $ele: js.UndefOr[JQuery[HTMLElement]] = js.native
    var container: js.UndefOr[js.Any] = js.native
    var containerRef: js.Any = js.native
    var options: js.Any = js.native
    var propsWithoutOptions: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MReactOwlCarousel(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactOwlCarousel(): Unit = js.native
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MReactOwlCarousel(): Unit = js.native
    def create(): Unit = js.native
    def create(options: Options): Unit = js.native
    def destory(): Unit = js.native
    def next(speed: js.Array[Double]): Unit = js.native
    def next(speed: Double): Unit = js.native
    def play(timeout: Double, speed: Double): Unit = js.native
    def prev(speed: js.Array[Double]): Unit = js.native
    def prev(speed: Double): Unit = js.native
    def stop(): Unit = js.native
    def to(position: Double, speed: Double): Unit = js.native
  }
  
  @js.native
  class default protected () extends ReactOwlCarousel {
    def this(props: OwlCarouselProps) = this()
  }
  
  type ComponentProps = AllHTMLAttributes[HTMLDivElement] with Anon_Children
  type OwlCarouselProps = Options with ComponentProps
}

