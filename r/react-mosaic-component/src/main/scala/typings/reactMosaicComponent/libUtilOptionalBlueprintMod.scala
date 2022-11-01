package typings.reactMosaicComponent

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilOptionalBlueprintMod {
  
  object OptionalBlueprint {
    
    @JSImport("react-mosaic-component/lib/util/OptionalBlueprint", "OptionalBlueprint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Icon(param0: typings.reactMosaicComponent.anon.Icon): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Icon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def getClasses(blueprintNamespace: String, names: BlueprintClass*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClasses")(scala.List(blueprintNamespace.asInstanceOf[js.Any]).`++`(names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    inline def getIconClass(
      blueprintNamespace: String,
      iconName: /* keyof react-mosaic-component.anon.TypeofIconNames */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1130, starting with typings.reactMosaicComponent.reactMosaicComponentStrings.FUNCTION, typings.reactMosaicComponent.reactMosaicComponentStrings.ADD, typings.reactMosaicComponent.reactMosaicComponentStrings.AIRPLANE */ Any
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getIconClass")(blueprintNamespace.asInstanceOf[js.Any], iconName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    type BlueprintClass = /* import warning: importer.ImportType#apply Failed type conversion: string extends string ? 'TREE_NODE_LABEL' : never */ js.Any
  }
}
