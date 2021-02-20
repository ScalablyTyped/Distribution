package typings.reactDocgenTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.reactDocgenTypescript.anon.FileName
import typings.reactDocgenTypescript.parserMod.ComponentDoc
import typings.reactDocgenTypescript.parserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(componentName: String, expected: ExpectedComponents): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: String
  ): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: String,
    parserOpts: ParserOptions
  ): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: Null,
    parserOpts: ParserOptions
  ): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(componentName: String, expected: ExpectedComponents, exactProperties: Boolean): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: js.UndefOr[scala.Nothing],
    parserOpts: ParserOptions
  ): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(componentName: String, expected: ExpectedComponents, exactProperties: Boolean, description: String): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: String,
    parserOpts: ParserOptions
  ): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "check")
  @js.native
  def check(
    componentName: String,
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: Null,
    parserOpts: ParserOptions
  ): Unit = js.native
  
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "checkComponent")
  @js.native
  def checkComponent(actual: js.Array[ComponentDoc], expected: ExpectedComponents): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "checkComponent")
  @js.native
  def checkComponent(
    actual: js.Array[ComponentDoc],
    expected: ExpectedComponents,
    exactProperties: js.UndefOr[scala.Nothing],
    description: String
  ): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "checkComponent")
  @js.native
  def checkComponent(actual: js.Array[ComponentDoc], expected: ExpectedComponents, exactProperties: Boolean): Unit = js.native
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "checkComponent")
  @js.native
  def checkComponent(
    actual: js.Array[ComponentDoc],
    expected: ExpectedComponents,
    exactProperties: Boolean,
    description: String
  ): Unit = js.native
  
  @JSImport("react-docgen-typescript/lib/@/tests/testUtils", "fixturePath")
  @js.native
  def fixturePath(componentName: String): String = js.native
  
  type ExpectedComponent = StringDictionary[ExpectedProp]
  
  type ExpectedComponents = StringDictionary[ExpectedComponent]
  
  @js.native
  trait ExpectedProp extends StObject {
    
    var defaultValue: js.UndefOr[String | Double | Boolean | Null] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var parent: js.UndefOr[FileName] = js.native
    
    var raw: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object ExpectedProp {
    
    @scala.inline
    def apply(`type`: String): ExpectedProp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedProp]
    }
    
    @scala.inline
    implicit class ExpectedPropMutableBuilder[Self <: ExpectedProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String | Double | Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setParent(value: FileName): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
