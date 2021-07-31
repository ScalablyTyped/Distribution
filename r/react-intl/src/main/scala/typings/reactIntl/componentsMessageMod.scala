package typings.reactIntl

import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMessageMod {
  
  @JSImport("react-intl/src/components/message", JSImport.Default)
  @js.native
  class default[V /* <: Record[String, js.Any] */] () extends FormattedMessage[V]
  object default {
    
    @JSImport("react-intl/src/components/message", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-intl/src/components/message", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FormattedMessage[V /* <: Record[String, js.Any] */]
    extends Component[Props[V], js.Object, js.Any] {
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MFormattedMessage(nextProps: Props[V]): Boolean = js.native
  }
  
  trait Props[V /* <: Record[String, js.Any] */]
    extends StObject
       with MessageDescriptor {
    
    var children: js.UndefOr[js.Function1[/* nodes */ ReactNodeArray, ReactNode]] = js.undefined
    
    var tagName: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var values: js.UndefOr[V] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply[V /* <: Record[String, js.Any] */](): Props[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[V]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[?], V /* <: Record[String, js.Any] */] (val x: Self & Props[V]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* nodes */ ReactNodeArray => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTagName(value: ElementType[js.Any]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setValues(value: V): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
