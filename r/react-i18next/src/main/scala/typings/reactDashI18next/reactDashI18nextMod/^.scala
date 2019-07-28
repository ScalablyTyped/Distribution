package typings.reactDashI18next.reactDashI18nextMod

import typings.i18next.i18nextMod.ReactOptions
import typings.i18next.i18nextMod.i18n
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.FunctionComponent
import typings.reactDashI18next.Anon_Ctx
import typings.reactDashI18next.Anon_InitialI18nStore
import typings.reactDashI18next.Anon_WithRef
import typings.reactDashI18next.Omit
import typings.reactDashI18next.reactDashI18nextStrings.tReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val I18nContext: Context[i18n] = js.native
  val I18nextProvider: FunctionComponent[I18nextProviderProps] = js.native
  def Trans(props: TransProps): js.Any = js.native
  def Translation(props: TranslationProps): js.Any = js.native
  def addUsedNamespaces(namespaces: js.Array[Namespace]): Unit = js.native
  def composeInitialProps(ForComponent: js.Any): js.Function1[/* ctx */ js.Any, js.Promise[_]] = js.native
  def getDefaults(): ReactOptions = js.native
  def getI18n(): i18n = js.native
  def getInitialProps(): Anon_InitialI18nStore = js.native
  def getUsedNamespaces(): js.Array[String] = js.native
  def setDefaults(options: ReactOptions): Unit = js.native
  def setI18n(instance: i18n): Unit = js.native
  def useSSR(initialI18nStore: js.Any, initialLanguage: js.Any): Unit = js.native
  def useTranslation(): UseTranslationResponse = js.native
  def useTranslation(ns: Namespace): UseTranslationResponse = js.native
  def useTranslation(ns: Namespace, options: UseTranslationOptions): UseTranslationResponse = js.native
  def withSSR(): js.Function1[/* WrappedComponent */ ComponentClass[js.Object, _], Anon_Ctx] = js.native
  def withTranslation(): js.Function1[
    /* component */ ComponentType[WithTranslation], 
    ComponentType[
      Omit[WithTranslation, typings.reactDashI18next.reactDashI18nextStrings.i18n | tReady]
    ]
  ] = js.native
  def withTranslation(ns: Namespace): js.Function1[
    /* component */ ComponentType[WithTranslation], 
    ComponentType[
      Omit[WithTranslation, typings.reactDashI18next.reactDashI18nextStrings.i18n | tReady]
    ]
  ] = js.native
  def withTranslation(ns: Namespace, options: Anon_WithRef): js.Function1[
    /* component */ ComponentType[WithTranslation], 
    ComponentType[
      Omit[WithTranslation, typings.reactDashI18next.reactDashI18nextStrings.i18n | tReady]
    ]
  ] = js.native
}

