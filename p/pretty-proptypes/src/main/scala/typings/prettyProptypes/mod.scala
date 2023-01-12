package typings.prettyProptypes

import org.scalablytyped.runtime.StringDictionary
import typings.prettyProptypes.anon.PartialComponents
import typings.prettyProptypes.prettyProptypesStrings.`object`
import typings.prettyProptypes.prettyProptypesStrings.generic
import typings.prettyProptypes.prettyProptypesStrings.intersection
import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pretty-proptypes", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DynamicPropsProps, js.Object, Any]
  
  @JSImport("pretty-proptypes", "Prop")
  @js.native
  open class Prop protected ()
    extends Component[PropProps, js.Object, Any] {
    def this(props: PropProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropProps, context: Any) = this()
  }
  
  @JSImport("pretty-proptypes", "components")
  @js.native
  val components: Components_ = js.native
  
  trait CommonProps extends StObject {
    
    var components: Components_
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var required: Boolean
    
    var shouldCollapse: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
    
    var typeValue: Kind
  }
  object CommonProps {
    
    inline def apply(components: Components_, name: String, required: Boolean, `type`: String, typeValue: Kind): CommonProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], typeValue = typeValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: Components_): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setShouldCollapse(value: Boolean): Self = StObject.set(x, "shouldCollapse", value.asInstanceOf[js.Any])
      
      inline def setShouldCollapseUndefined: Self = StObject.set(x, "shouldCollapse", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeValue(value: Kind): Self = StObject.set(x, "typeValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Components_ extends StObject {
    
    var Button: ComponentType[Any]
    
    var Description: ComponentType[Any]
    
    var FunctionType: ComponentType[Any]
    
    var Indent: ComponentType[Any]
    
    var Outline: ComponentType[Any]
    
    var Required: ComponentType[Any]
    
    var StringType: ComponentType[Any]
    
    var Type: ComponentType[Any]
    
    var TypeMeta: ComponentType[Any]
  }
  object Components_ {
    
    inline def apply(
      Button: ComponentType[Any],
      Description: ComponentType[Any],
      FunctionType: ComponentType[Any],
      Indent: ComponentType[Any],
      Outline: ComponentType[Any],
      Required: ComponentType[Any],
      StringType: ComponentType[Any],
      Type: ComponentType[Any],
      TypeMeta: ComponentType[Any]
    ): Components_ = {
      val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FunctionType = FunctionType.asInstanceOf[js.Any], Indent = Indent.asInstanceOf[js.Any], Outline = Outline.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], StringType = StringType.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeMeta = TypeMeta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Components_] (val x: Self) extends AnyVal {
      
      inline def setButton(value: ComponentType[Any]): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: ComponentType[Any]): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setFunctionType(value: ComponentType[Any]): Self = StObject.set(x, "FunctionType", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: ComponentType[Any]): Self = StObject.set(x, "Indent", value.asInstanceOf[js.Any])
      
      inline def setOutline(value: ComponentType[Any]): Self = StObject.set(x, "Outline", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: ComponentType[Any]): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
      
      inline def setStringType(value: ComponentType[Any]): Self = StObject.set(x, "StringType", value.asInstanceOf[js.Any])
      
      inline def setType(value: ComponentType[Any]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeMeta(value: ComponentType[Any]): Self = StObject.set(x, "TypeMeta", value.asInstanceOf[js.Any])
    }
  }
  
  trait DynamicPropsProps extends StObject {
    
    var components: js.UndefOr[PartialComponents] = js.undefined
    
    var heading: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[StringDictionary[ComponentType[CommonProps]]] = js.undefined
    
    var props: typings.prettyProptypes.anon.Component
    
    var shouldCollapseProps: js.UndefOr[Boolean] = js.undefined
  }
  object DynamicPropsProps {
    
    inline def apply(props: typings.prettyProptypes.anon.Component): DynamicPropsProps = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicPropsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicPropsProps] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: PartialComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setOverrides(value: StringDictionary[ComponentType[CommonProps]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setProps(value: typings.prettyProptypes.anon.Component): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setShouldCollapseProps(value: Boolean): Self = StObject.set(x, "shouldCollapseProps", value.asInstanceOf[js.Any])
      
      inline def setShouldCollapsePropsUndefined: Self = StObject.set(x, "shouldCollapseProps", js.undefined)
    }
  }
  
  trait Gen extends StObject {
    
    var kind: generic
    
    var value: Any
  }
  object Gen {
    
    inline def apply(value: Any): Gen = {
      val __obj = js.Dynamic.literal(kind = "generic", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gen]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Gen] (val x: Self) extends AnyVal {
      
      inline def setKind(value: generic): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inter extends StObject {
    
    var kind: intersection
    
    var types: js.Array[Obj | Gen]
  }
  object Inter {
    
    inline def apply(types: js.Array[Obj | Gen]): Inter = {
      val __obj = js.Dynamic.literal(kind = "intersection", types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inter] (val x: Self) extends AnyVal {
      
      inline def setKind(value: intersection): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[Obj | Gen]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: (Obj | Gen)*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  type Kind = Any
  
  trait Obj extends StObject {
    
    var kind: `object`
    
    var members: js.Array[Any]
  }
  object Obj {
    
    inline def apply(members: js.Array[Any]): Obj = {
      val __obj = js.Dynamic.literal(kind = "object", members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[Obj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Obj] (val x: Self) extends AnyVal {
      
      inline def setKind(value: `object`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[Any]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: Any*): Self = StObject.set(x, "members", js.Array(value*))
    }
  }
  
  trait PropProps
    extends StObject
       with CommonProps {
    
    var shapeComponent: ComponentType[CommonProps]
  }
  object PropProps {
    
    inline def apply(
      components: Components_,
      name: String,
      required: Boolean,
      shapeComponent: ComponentType[CommonProps],
      `type`: String,
      typeValue: Kind
    ): PropProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], shapeComponent = shapeComponent.asInstanceOf[js.Any], typeValue = typeValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropProps] (val x: Self) extends AnyVal {
      
      inline def setShapeComponent(value: ComponentType[CommonProps]): Self = StObject.set(x, "shapeComponent", value.asInstanceOf[js.Any])
    }
  }
  
  type Props = Component[DynamicPropsProps, js.Object, Any]
}
