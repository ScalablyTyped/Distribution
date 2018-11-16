package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", JSImport.Namespace)
@js.native
object reactDashI18nextModMembers extends js.Object {
  val I18nContext: createDashReactDashContextLib.createDashReactDashContextMod.Context[I18nContextValues] = js.native
  val I18nextProvider: reactLib.reactMod.ReactNs.ComponentClass[I18nextProviderProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val NamespacesConsumer: reactLib.reactMod.ReactNs.ComponentClass[NamespacesConsumerProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val Trans: reactLib.reactMod.ReactNs.ComponentClass[TransProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val reactI18nextModule: ReactI18nextModule = js.native
  val translate: js.Function2[
    /* namespace */ js.UndefOr[reactDashI18nextLib.Namespace | NamespaceExtractor], 
    /* options */ js.UndefOr[WithNamespacesOptions], 
    js.Function1[
      /* component */ reactLib.reactMod.ReactNs.ComponentType[WithNamespaces], 
      reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.Subtract[WithNamespaces, WithNamespaces]]
    ]
  ] = js.native
  def getDefaults(): ReactI18NextOptions = js.native
  def getI18n(): i18nextLib.i18nextMod.i18nextNs.i18n = js.native
  def setDefaults(options: ReactI18NextOptions): scala.Unit = js.native
  def setI18n(instance: i18nextLib.i18nextMod.i18nextNs.i18n): scala.Unit = js.native
  def withI18n(): js.Function1[
    /* Wrapper */ reactLib.reactMod.ReactNs.ComponentType[js.Object], 
    reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.Subtract[js.Object, WithI18n]]
  ] = js.native
  def withNamespaces(): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.Subtract[WithNamespaces, WithNamespaces]]
  ] = js.native
  def withNamespaces(namespace: reactDashI18nextLib.Namespace): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.Subtract[WithNamespaces, WithNamespaces]]
  ] = js.native
  def withNamespaces(namespace: reactDashI18nextLib.Namespace, options: WithNamespacesOptions): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.Subtract[WithNamespaces, WithNamespaces]]
  ] = js.native
  def withNamespaces(namespace: NamespaceExtractor): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.Subtract[WithNamespaces, WithNamespaces]]
  ] = js.native
  def withNamespaces(namespace: NamespaceExtractor, options: WithNamespacesOptions): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.Subtract[WithNamespaces, WithNamespaces]]
  ] = js.native
}

