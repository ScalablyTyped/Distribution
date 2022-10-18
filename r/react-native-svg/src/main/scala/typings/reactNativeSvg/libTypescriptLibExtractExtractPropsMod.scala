package typings.reactNativeSvg

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeSvg.anon.Objectstyleundefined
import typings.reactNativeSvg.anon.idstringundefinedmaskstri
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.extractedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptLibExtractExtractPropsMod {
  
  @JSImport("react-native-svg/lib/typescript/lib/extract/extractProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: idstringundefinedmaskstri, ref: js.Object): extractedProps = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[extractedProps]
  
  inline def extract(instance: js.Object, props: Objectstyleundefined): extractedProps = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(instance.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[extractedProps]
  
  inline def propsAndStyles(props: Objectstyleundefined): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("propsAndStyles")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def stringifyPropsForFabric(props: StringDictionary[js.UndefOr[NumberProp | Null]]): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPropsForFabric")(props.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def withoutXY(instance: js.Object, props: Objectstyleundefined): extractedProps = (^.asInstanceOf[js.Dynamic].applyDynamic("withoutXY")(instance.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[extractedProps]
}
