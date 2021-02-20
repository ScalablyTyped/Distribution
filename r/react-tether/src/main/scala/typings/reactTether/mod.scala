package typings.reactTether

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactTether.mod.ReactTether.TetherComponentProps
import typings.reactTether.reactTetherStrings.together
import typings.std.Element
import typings.std.HTMLElement
import typings.tether.mod.ITetherOptions
import typings.tether.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tether", JSImport.Default)
  @js.native
  class default () extends TetherComponent
  object default {
    
    @JSImport("react-tether", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-tether", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-tether", "default.defaultProps.renderElementTag")
      @js.native
      def renderElementTag: String = js.native
      @scala.inline
      def renderElementTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderElementTag")(x.asInstanceOf[js.Any])
      
      @JSImport("react-tether", "default.defaultProps.renderElementTo")
      @js.native
      def renderElementTo: js.Any = js.native
      @scala.inline
      def renderElementTo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderElementTo")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-tether", "default.propTypes")
    @js.native
    def propTypes: TetherComponentProps = js.native
    @scala.inline
    def propTypes_=(x: TetherComponentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object ReactTether {
    
    @js.native
    trait Constraints extends StObject {
      
      var attachment: js.UndefOr[String | together] = js.native
      
      var outOfBoundsClass: js.UndefOr[String] = js.native
      
      var pin: js.UndefOr[Boolean | js.Array[String]] = js.native
      
      var pinnedClass: js.UndefOr[String] = js.native
      
      var to: js.UndefOr[ContraintsTo] = js.native
    }
    object Constraints {
      
      @scala.inline
      def apply(): Constraints = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Constraints]
      }
      
      @scala.inline
      implicit class ConstraintsMutableBuilder[Self <: Constraints] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttachment(value: String | together): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
        
        @scala.inline
        def setOutOfBoundsClass(value: String): Self = StObject.set(x, "outOfBoundsClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutOfBoundsClassUndefined: Self = StObject.set(x, "outOfBoundsClass", js.undefined)
        
        @scala.inline
        def setPin(value: Boolean | js.Array[String]): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
        
        @scala.inline
        def setPinVarargs(value: String*): Self = StObject.set(x, "pin", js.Array(value :_*))
        
        @scala.inline
        def setPinnedClass(value: String): Self = StObject.set(x, "pinnedClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPinnedClassUndefined: Self = StObject.set(x, "pinnedClass", js.undefined)
        
        @scala.inline
        def setTo(value: ContraintsTo): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - java.lang.String
      - typings.reactTether.reactTetherStrings.window
      - typings.reactTether.reactTetherStrings.scrollParent
      - typings.std.HTMLElement
    */
    type ContraintsTo = _ContraintsTo | String | HTMLElement
    
    type RenderProp = js.Function1[/* ref */ RefObject[Element], ReactNode]
    
    @js.native
    trait TetherAttachment extends StObject {
      
      var left: String = js.native
      
      var top: String = js.native
    }
    object TetherAttachment {
      
      @scala.inline
      def apply(left: String, top: String): TetherAttachment = {
        val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[TetherAttachment]
      }
      
      @scala.inline
      implicit class TetherAttachmentMutableBuilder[Self <: TetherAttachment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait TetherComponentProps
      extends Props[TetherComponent]
         with ITetherOptions {
      
      var className: js.UndefOr[String] = js.native
      
      @JSName("constraints")
      var constraints_TetherComponentProps: js.UndefOr[js.Array[Constraints]] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var onRepositioned: js.UndefOr[js.Function0[Unit]] = js.native
      
      var onUpdate: js.UndefOr[js.Function1[/* data */ UpdateEventData, Unit]] = js.native
      
      var renderElement: js.UndefOr[RenderProp] = js.native
      
      var renderElementTag: js.UndefOr[String] = js.native
      
      var renderElementTo: js.UndefOr[Element | String] = js.native
      
      var renderTarget: js.UndefOr[RenderProp] = js.native
      
      var style: js.UndefOr[CSSProperties] = js.native
    }
    object TetherComponentProps {
      
      @scala.inline
      def apply(attachment: String): TetherComponentProps = {
        val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
        __obj.asInstanceOf[TetherComponentProps]
      }
      
      @scala.inline
      implicit class TetherComponentPropsMutableBuilder[Self <: TetherComponentProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setConstraints(value: js.Array[Constraints]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
        
        @scala.inline
        def setConstraintsVarargs(value: Constraints*): Self = StObject.set(x, "constraints", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setOnRepositioned(value: () => Unit): Self = StObject.set(x, "onRepositioned", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnRepositionedUndefined: Self = StObject.set(x, "onRepositioned", js.undefined)
        
        @scala.inline
        def setOnUpdate(value: /* data */ UpdateEventData => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
        
        @scala.inline
        def setRenderElement(value: /* ref */ RefObject[Element] => ReactNode): Self = StObject.set(x, "renderElement", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRenderElementTag(value: String): Self = StObject.set(x, "renderElementTag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderElementTagUndefined: Self = StObject.set(x, "renderElementTag", js.undefined)
        
        @scala.inline
        def setRenderElementTo(value: Element | String): Self = StObject.set(x, "renderElementTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderElementToUndefined: Self = StObject.set(x, "renderElementTo", js.undefined)
        
        @scala.inline
        def setRenderElementUndefined: Self = StObject.set(x, "renderElement", js.undefined)
        
        @scala.inline
        def setRenderTarget(value: /* ref */ RefObject[Element] => ReactNode): Self = StObject.set(x, "renderTarget", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRenderTargetUndefined: Self = StObject.set(x, "renderTarget", js.undefined)
        
        @scala.inline
        def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    @js.native
    trait UpdateEventData extends StObject {
      
      var attachment: TetherAttachment = js.native
      
      var targetAttachment: TetherAttachment = js.native
    }
    object UpdateEventData {
      
      @scala.inline
      def apply(attachment: TetherAttachment, targetAttachment: TetherAttachment): UpdateEventData = {
        val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], targetAttachment = targetAttachment.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateEventData]
      }
      
      @scala.inline
      implicit class UpdateEventDataMutableBuilder[Self <: UpdateEventData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttachment(value: TetherAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetAttachment(value: TetherAttachment): Self = StObject.set(x, "targetAttachment", value.asInstanceOf[js.Any])
      }
    }
    
    trait _ContraintsTo extends StObject
  }
  
  @js.native
  trait TetherComponent
    extends Component[TetherComponentProps, js.Object, js.Any] {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def getTetherInstance(): ^ = js.native
    
    def off(event: js.Any, handler: js.Any): Unit = js.native
    
    def on(event: js.Any, handler: js.Any): Unit = js.native
    def on(event: js.Any, handler: js.Any, ctx: js.Any): Unit = js.native
    
    def once(event: js.Any, handler: js.Any): Unit = js.native
    def once(event: js.Any, handler: js.Any, ctx: js.Any): Unit = js.native
    
    def position(): Unit = js.native
    
    @JSName("props")
    var props_TetherComponent: TetherComponentProps = js.native
  }
}
