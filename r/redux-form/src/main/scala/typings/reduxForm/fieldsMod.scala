package typings.reduxForm

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reduxForm.fieldMod.Formatter
import typings.reduxForm.fieldMod.Parser
import typings.reduxForm.fieldMod.Validator
import typings.reduxForm.fieldMod.WrappedFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsMod {
  
  @JSImport("redux-form/lib/Fields", "Fields")
  @js.native
  class Fields[P] protected () extends GenericFields[P] {
    def this(props: BaseFieldsProps[P] with P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldsProps[P] with P, context: js.Any) = this()
  }
  
  @js.native
  trait BaseFieldsProps[P] extends StObject {
    
    var component: js.UndefOr[ComponentType[_]] = js.native
    
    var format: js.UndefOr[Formatter | Null] = js.native
    
    var forwardRef: js.UndefOr[Boolean] = js.native
    
    var names: js.Array[String] = js.native
    
    var parse: js.UndefOr[Parser] = js.native
    
    var props: js.UndefOr[P] = js.native
    
    var validate: js.UndefOr[FieldsWarnerOrValidator] = js.native
    
    var warn: js.UndefOr[FieldsWarnerOrValidator] = js.native
  }
  object BaseFieldsProps {
    
    @scala.inline
    def apply[P](names: js.Array[String]): BaseFieldsProps[P] = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFieldsProps[P]]
    }
    
    @scala.inline
    implicit class BaseFieldsPropsMutableBuilder[Self <: BaseFieldsProps[_], P] (val x: Self with BaseFieldsProps[P]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setFormat(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatNull: Self = StObject.set(x, "format", null)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setParse(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setValidate(value: FieldsWarnerOrValidator): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValidateVarargs(value: Validator*): Self = StObject.set(x, "validate", js.Array(value :_*))
      
      @scala.inline
      def setWarn(value: FieldsWarnerOrValidator): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "warn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      @scala.inline
      def setWarnVarargs(value: Validator*): Self = StObject.set(x, "warn", js.Array(value :_*))
    }
  }
  
  type FieldsWarnerOrValidator = Validator | js.Array[Validator] | (StringDictionary[Validator | js.Array[Validator]])
  
  @js.native
  trait GenericFields[P]
    extends Component[BaseFieldsProps[P] with P, js.Object, js.Any] {
    
    var dirty: Boolean = js.native
    
    def getRenderedComponent(): Component[BaseFieldsProps[js.Object] with WrappedFieldsProps with P, js.Object, _] = js.native
    
    var names: js.Array[String] = js.native
    
    var pristine: Boolean = js.native
    
    var values: StringDictionary[js.Any] = js.native
  }
  
  @js.native
  trait WrappedFieldsProps extends /* name */ StringDictionary[WrappedFieldsProps with WrappedFieldProps]
  object WrappedFieldsProps {
    
    @scala.inline
    def apply(): WrappedFieldsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrappedFieldsProps]
    }
  }
}
