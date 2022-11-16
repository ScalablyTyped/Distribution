package typings.reduxForm

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reduxForm.libFieldMod.Formatter
import typings.reduxForm.libFieldMod.Parser
import typings.reduxForm.libFieldMod.Validator
import typings.reduxForm.libFieldMod.WrappedFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldsMod {
  
  @JSImport("redux-form/lib/Fields", "Fields")
  @js.native
  open class Fields[P] protected () extends GenericFields[P] {
    def this(props: BaseFieldsProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldsProps[P] & P, context: Any) = this()
  }
  
  trait BaseFieldsProps[P] extends StObject {
    
    var component: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var format: js.UndefOr[Formatter | Null] = js.undefined
    
    var forwardRef: js.UndefOr[Boolean] = js.undefined
    
    var names: js.Array[String]
    
    var parse: js.UndefOr[Parser] = js.undefined
    
    var props: js.UndefOr[P] = js.undefined
    
    var validate: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
    
    var warn: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
  }
  object BaseFieldsProps {
    
    inline def apply[P](names: js.Array[String]): BaseFieldsProps[P] = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFieldsProps[P]]
    }
    
    extension [Self <: BaseFieldsProps[?], P](x: Self & BaseFieldsProps[P]) {
      
      inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setFormat(value: (/* value */ Any, /* name */ String) => Any): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatNull: Self = StObject.set(x, "format", null)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setParse(value: (/* value */ Any, /* name */ String) => Any): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setValidate(value: FieldsWarnerOrValidator): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction4(
        value: (/* value */ Any, /* allValues */ js.UndefOr[Any], /* props */ js.UndefOr[Any], /* name */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidateVarargs(value: Validator*): Self = StObject.set(x, "validate", js.Array(value*))
      
      inline def setWarn(value: FieldsWarnerOrValidator): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnFunction4(
        value: (/* value */ Any, /* allValues */ js.UndefOr[Any], /* props */ js.UndefOr[Any], /* name */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "warn", js.Any.fromFunction4(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      inline def setWarnVarargs(value: Validator*): Self = StObject.set(x, "warn", js.Array(value*))
    }
  }
  
  type FieldsWarnerOrValidator = Validator | js.Array[Validator] | (StringDictionary[Validator | js.Array[Validator]])
  
  @js.native
  trait GenericFields[P]
    extends Component[BaseFieldsProps[P] & P, js.Object, Any] {
    
    var dirty: Boolean = js.native
    
    def getRenderedComponent(): Component[BaseFieldsProps[js.Object] & WrappedFieldsProps & P, js.Object, Any] = js.native
    
    var names: js.Array[String] = js.native
    
    var pristine: Boolean = js.native
    
    var values: StringDictionary[Any] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type WrappedFieldsProps = {[name: string] : redux-form.redux-form/lib/Fields.WrappedFieldsProps & redux-form.redux-form/lib/Field.WrappedFieldProps}
  }}}
  to avoid circular code involving: 
  - redux-form.redux-form/lib/Fields.WrappedFieldsProps
  */
  trait WrappedFieldsProps
    extends StObject
       with /* name */ StringDictionary[WrappedFieldsProps & WrappedFieldProps]
  object WrappedFieldsProps {
    
    inline def apply(): WrappedFieldsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrappedFieldsProps]
    }
  }
}
