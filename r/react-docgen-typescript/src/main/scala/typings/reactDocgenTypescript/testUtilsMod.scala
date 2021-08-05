package typings.reactDocgenTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.reactDocgenTypescript.anon.FileName
import typings.reactDocgenTypescript.parserMod.ComponentDoc
import typings.reactDocgenTypescript.parserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(componentName: String, expected: ExpectedComponents): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(componentName: String, expected: ExpectedComponents, exactProperties: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(componentName: String, expected: ExpectedComponents, exactProperties: Boolean, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: String,
    parserOpts: ParserOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: Null,
    parserOpts: ParserOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: Unit,
    parserOpts: ParserOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(componentName: String, expected: ExpectedComponents, exactProperties: Unit, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Unit,
    description: String,
    parserOpts: ParserOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Unit,
    description: Null,
    parserOpts: ParserOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Unit,
    description: Unit,
    parserOpts: ParserOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(componentName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkComponent(actual: js.Array[ComponentDoc], expected: ExpectedComponents): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComponent")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkComponent(actual: js.Array[ComponentDoc], expected: ExpectedComponents, exactProperties: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComponent")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkComponent(
    actual: js.Array[ComponentDoc],
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComponent")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkComponent(
    actual: js.Array[ComponentDoc],
    expected: ExpectedComponents,
    exactProperties: Unit,
    description: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComponent")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], exactProperties.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fixturePath(componentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixturePath")(componentName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ExpectedComponent = StringDictionary[ExpectedProp]
  
  type ExpectedComponents = StringDictionary[ExpectedComponent]
  
  trait ExpectedProp extends StObject {
    
    var defaultValue: js.UndefOr[String | Double | Boolean | Null] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[FileName] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object ExpectedProp {
    
    inline def apply(`type`: String): ExpectedProp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedProp]
    }
    
    extension [Self <: ExpectedProp](x: Self) {
      
      inline def setDefaultValue(value: String | Double | Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setParent(value: FileName): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
