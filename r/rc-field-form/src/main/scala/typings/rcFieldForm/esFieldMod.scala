package typings.rcFieldForm

import org.scalablytyped.runtime.StringDictionary
import typings.rcFieldForm.anon.Metadestroybooleanundefin
import typings.rcFieldForm.anon.Source
import typings.rcFieldForm.esInterfaceMod.EventArgs
import typings.rcFieldForm.esInterfaceMod.FormInstance
import typings.rcFieldForm.esInterfaceMod.InternalFormInstance
import typings.rcFieldForm.esInterfaceMod.InternalNamePath
import typings.rcFieldForm.esInterfaceMod.Meta
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.rcFieldForm.esInterfaceMod.Rule
import typings.rcFieldForm.esInterfaceMod.Store
import typings.rcFieldForm.esInterfaceMod.StoreValue
import typings.rcFieldForm.rcFieldFormBooleans.`false`
import typings.rcFieldForm.rcFieldFormStrings.parallel
import typings.react.mod.JSX.Element
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFieldMod {
  
  @JSImport("rc-field-form/es/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Values](param0: FieldProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ChildProps = StringDictionary[Any]
  
  /* Inlined parent std.Omit<rc-field-form.rc-field-form/es/Field.InternalFieldProps<Values>, 'name' | 'fieldContext'> */
  trait FieldProps[Values] extends StObject {
    
    var children: js.UndefOr[
        ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values], ReactNode])
      ] = js.undefined
    
    var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.undefined
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, Record[String, Any]]] = js.undefined
    
    var initialValue: js.UndefOr[Any] = js.undefined
    
    var isList: js.UndefOr[Boolean] = js.undefined
    
    var isListField: js.UndefOr[Boolean] = js.undefined
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: js.UndefOr[NamePath] = js.undefined
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.undefined
    
    var onMetaChange: js.UndefOr[js.Function1[/* meta */ Metadestroybooleanundefin, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var rules: js.UndefOr[js.Array[Rule]] = js.undefined
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[Values]] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.undefined
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
    
    var valuePropName: js.UndefOr[String] = js.undefined
  }
  object FieldProps {
    
    inline def apply[Values](): FieldProps[Values] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps[Values]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldProps[?], Values] (val x: Self & FieldProps[Values]) extends AnyVal {
      
      inline def setChildren(
        value: ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values], ReactNode])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values]) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      inline def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      inline def setGetValueProps(value: /* value */ StoreValue => Record[String, Any]): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      inline def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      inline def setInitialValue(value: Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      inline def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      inline def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      inline def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      inline def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      inline def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = StObject.set(x, "normalize", js.Any.fromFunction3(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOnMetaChange(value: /* meta */ Metadestroybooleanundefin => Unit): Self = StObject.set(x, "onMetaChange", js.Any.fromFunction1(value))
      
      inline def setOnMetaChangeUndefined: Self = StObject.set(x, "onMetaChange", js.undefined)
      
      inline def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setShouldUpdate(value: ShouldUpdate[Values]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateFunction3(value: (Values, Values, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setValidateFirst(value: Boolean | parallel): Self = StObject.set(x, "validateFirst", value.asInstanceOf[js.Any])
      
      inline def setValidateFirstUndefined: Self = StObject.set(x, "validateFirst", js.undefined)
      
      inline def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      inline def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      inline def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value*))
      
      inline def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      inline def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
    }
  }
  
  trait FieldState extends StObject {
    
    var resetCount: Double
  }
  object FieldState {
    
    inline def apply(resetCount: Double): FieldState = {
      val __obj = js.Dynamic.literal(resetCount = resetCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldState] (val x: Self) extends AnyVal {
      
      inline def setResetCount(value: Double): Self = StObject.set(x, "resetCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalFieldProps[Values] extends StObject {
    
    var children: js.UndefOr[
        ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values], ReactNode])
      ] = js.undefined
    
    /**
      * Set up `dependencies` field.
      * When dependencies field update and current field is touched,
      * will trigger validate rules and render.
      */
    var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
    
    /** @private Pass context as prop instead of context api
      *  since class component can not get context in constructor */
    var fieldContext: js.UndefOr[InternalFormInstance] = js.undefined
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.undefined
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, Record[String, Any]]] = js.undefined
    
    var initialValue: js.UndefOr[Any] = js.undefined
    
    /** @private Passed by Form.List props. Do not use since it will break by path check. */
    var isList: js.UndefOr[Boolean] = js.undefined
    
    /** @private Passed by Form.List props. Do not use since it will break by path check. */
    var isListField: js.UndefOr[Boolean] = js.undefined
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: js.UndefOr[InternalNamePath] = js.undefined
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.undefined
    
    var onMetaChange: js.UndefOr[js.Function1[/* meta */ Metadestroybooleanundefin, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var rules: js.UndefOr[js.Array[Rule]] = js.undefined
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[Values]] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.undefined
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
    
    var valuePropName: js.UndefOr[String] = js.undefined
  }
  object InternalFieldProps {
    
    inline def apply[Values](): InternalFieldProps[Values] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalFieldProps[Values]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalFieldProps[?], Values] (val x: Self & InternalFieldProps[Values]) extends AnyVal {
      
      inline def setChildren(
        value: ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values], ReactNode])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction3(value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values]) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setFieldContext(value: InternalFormInstance): Self = StObject.set(x, "fieldContext", value.asInstanceOf[js.Any])
      
      inline def setFieldContextUndefined: Self = StObject.set(x, "fieldContext", js.undefined)
      
      inline def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      inline def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      inline def setGetValueProps(value: /* value */ StoreValue => Record[String, Any]): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      inline def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      inline def setInitialValue(value: Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      inline def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      inline def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      inline def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      inline def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      inline def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = StObject.set(x, "normalize", js.Any.fromFunction3(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOnMetaChange(value: /* meta */ Metadestroybooleanundefin => Unit): Self = StObject.set(x, "onMetaChange", js.Any.fromFunction1(value))
      
      inline def setOnMetaChangeUndefined: Self = StObject.set(x, "onMetaChange", js.undefined)
      
      inline def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setShouldUpdate(value: ShouldUpdate[Values]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateFunction3(value: (Values, Values, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setValidateFirst(value: Boolean | parallel): Self = StObject.set(x, "validateFirst", value.asInstanceOf[js.Any])
      
      inline def setValidateFirstUndefined: Self = StObject.set(x, "validateFirst", js.undefined)
      
      inline def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      inline def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      inline def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value*))
      
      inline def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      inline def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
    }
  }
  
  type ShouldUpdate[Values] = Boolean | (js.Function3[/* prevValues */ Values, /* nextValues */ Values, /* info */ Source, Boolean])
}
