package typings.reactI18next

import typings.i18next.mod.FallbackOrNS
import typings.i18next.mod.KeyPrefix
import typings.i18next.mod.Namespace
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactI18next.anon.Children
import typings.reactI18next.reactI18nextStrings.translation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transWithoutContextMod {
  
  @JSImport("react-i18next/TransWithoutContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Trans[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */, E](props: TransProps[K, N, TKPrefix, E]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Trans")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* Inlined i18next.i18next.TypeOptions['defaultNS'] */
  type DefaultNamespace = translation
  
  type TransChild = ReactNode | (Record[String, Any])
  
  type TransProps[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix, E] = E & (Children[K, N, TKPrefix])
}
