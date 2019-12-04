package typings.reactDashLive

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLProps
import typings.reactDashLive.reactDashLiveMod.DivProps
import typings.reactDashLive.reactDashLiveMod.EditorProps
import typings.reactDashLive.reactDashLiveMod.LiveEditorProps
import typings.reactDashLive.reactDashLiveMod.LiveProviderProps
import typings.reactDashLive.reactDashLiveMod.Omit
import typings.reactDashLive.reactDashLiveMod.PreProps
import typings.reactDashLive.reactDashLiveStrings.onChange
import typings.reactDashLive.reactDashLiveStrings.scope
import typings.std.Exclude
import typings.std.HTMLDivElement
import typings.std.HTMLPreElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-live", JSImport.Namespace)
@js.native
object reactDashLiveMod extends js.Object {
  @js.native
  class Editor protected ()
    extends Component[EditorProps, ComponentState, js.Any] {
    def this(props: EditorProps) = this()
    def this(props: EditorProps, context: js.Any) = this()
  }
  
  @js.native
  class LiveEditor protected ()
    extends Component[LiveEditorProps, ComponentState, js.Any] {
    def this(props: LiveEditorProps) = this()
    def this(props: LiveEditorProps, context: js.Any) = this()
  }
  
  @js.native
  class LiveError protected ()
    extends Component[DivProps, ComponentState, js.Any] {
    def this(props: DivProps) = this()
    def this(props: DivProps, context: js.Any) = this()
  }
  
  @js.native
  class LivePreview protected ()
    extends Component[DivProps, ComponentState, js.Any] {
    def this(props: DivProps) = this()
    def this(props: DivProps, context: js.Any) = this()
  }
  
  @js.native
  class LiveProvider protected ()
    extends Component[LiveProviderProps, ComponentState, js.Any] {
    def this(props: LiveProviderProps) = this()
    def this(props: LiveProviderProps, context: js.Any) = this()
  }
  
  val Editor: ComponentClass[EditorProps, ComponentState] = js.native
  val LiveEditor: ComponentClass[LiveEditorProps, ComponentState] = js.native
  val LiveError: ComponentClass[DivProps, ComponentState] = js.native
  val LivePreview: ComponentClass[DivProps, ComponentState] = js.native
  val LiveProvider: ComponentClass[LiveProviderProps, ComponentState] = js.native
  def withLive[P](wrappedComponent: ComponentType[P]): ComponentClass[P, ComponentState] = js.native
  // React Element Props
  type DivProps = HTMLProps[HTMLDivElement]
  type EditorProps = (Omit[PreProps, onChange]) with Anon_CodeDisabled
  type LiveEditorProps = EditorProps
  type LiveProviderProps = (Omit[DivProps, scope]) with Anon_Code
  // Helper types
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PreProps = HTMLProps[HTMLPreElement]
}

