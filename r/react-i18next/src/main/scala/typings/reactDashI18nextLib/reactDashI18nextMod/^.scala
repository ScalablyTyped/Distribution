package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val initReactI18next: reactDashI18nextLib.Anon_Init = js.native
  def Trans(props: reactDashI18nextLib.reactDashI18nextMod.TransProps): js.Any = js.native
  def Translation(props: reactDashI18nextLib.reactDashI18nextMod.TranslationProps): js.Any = js.native
  def addUsedNamespaces(namespaces: js.Array[reactDashI18nextLib.reactDashI18nextMod.Namespace]): scala.Unit = js.native
  def composeInitialProps(ForComponent: js.Any): js.Function1[/* ctx */ js.Any, js.Promise[_]] = js.native
  def getDefaults(): i18nextLib.i18nextMod.i18nextNs.ReactOptions = js.native
  def getI18n(): i18nextLib.i18nextMod.i18nextNs.i18n = js.native
  def getInitialProps(): reactDashI18nextLib.Anon_InitialI18nStore = js.native
  def getUsedNamespaces(): js.Array[java.lang.String] = js.native
  def setDefaults(options: i18nextLib.i18nextMod.i18nextNs.ReactOptions): scala.Unit = js.native
  def setI18n(instance: i18nextLib.i18nextMod.i18nextNs.i18n): scala.Unit = js.native
  def useSSR(initialI18nStore: js.Any, initialLanguage: js.Any): scala.Unit = js.native
  def useTranslation(): js.Tuple2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ _, 
    i18nextLib.i18nextMod.i18nextNs.i18n
  ] = js.native
  def useTranslation(ns: reactDashI18nextLib.reactDashI18nextMod.Namespace): js.Tuple2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ _, 
    i18nextLib.i18nextMod.i18nextNs.i18n
  ] = js.native
  def useTranslation(
    ns: reactDashI18nextLib.reactDashI18nextMod.Namespace,
    options: reactDashI18nextLib.reactDashI18nextMod.UseTranslationOptions
  ): js.Tuple2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify i18next.TFunction */ _, 
    i18nextLib.i18nextMod.i18nextNs.i18n
  ] = js.native
  def withSSR(): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentClass[js.Object, _], 
    reactDashI18nextLib.Anon_Ctx
  ] = js.native
  def withTranslation(): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithTranslation], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Omit[
        reactDashI18nextLib.reactDashI18nextMod.WithTranslation, 
        reactDashI18nextLib.reactDashI18nextLibStrings.i18n
      ]
    ]
  ] = js.native
  def withTranslation(ns: reactDashI18nextLib.reactDashI18nextMod.Namespace): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithTranslation], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Omit[
        reactDashI18nextLib.reactDashI18nextMod.WithTranslation, 
        reactDashI18nextLib.reactDashI18nextLibStrings.i18n
      ]
    ]
  ] = js.native
}

