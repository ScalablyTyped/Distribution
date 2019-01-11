package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val I18nContext: reactLib.reactMod.ReactNs.Context[reactDashI18nextLib.reactDashI18nextMod.I18nContextValues] = js.native
  val I18nextProvider: reactLib.reactMod.ReactNs.ComponentClass[
    reactDashI18nextLib.reactDashI18nextMod.I18nextProviderProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val NamespacesConsumer: reactLib.reactMod.ReactNs.ComponentClass[
    reactDashI18nextLib.reactDashI18nextMod.NamespacesConsumerProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val Trans: reactLib.reactMod.ReactNs.ComponentClass[
    reactDashI18nextLib.reactDashI18nextMod.TransProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val reactI18nextModule: reactDashI18nextLib.reactDashI18nextMod.ReactI18nextModule = js.native
  val translate: js.Function2[
    /* namespace */ js.UndefOr[
      reactDashI18nextLib.Namespace | reactDashI18nextLib.reactDashI18nextMod.NamespaceExtractor
    ], 
    /* options */ js.UndefOr[reactDashI18nextLib.reactDashI18nextMod.WithNamespacesOptions], 
    js.Function1[
      /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithNamespaces], 
      reactLib.reactMod.ReactNs.ComponentType[
        reactDashI18nextLib.Subtract[
          reactDashI18nextLib.reactDashI18nextMod.WithNamespaces, 
          reactDashI18nextLib.reactDashI18nextMod.WithNamespaces
        ]
      ]
    ]
  ] = js.native
  def getDefaults(): reactDashI18nextLib.reactDashI18nextMod.ReactI18NextOptions = js.native
  def getI18n(): i18nextLib.i18nextMod.i18nextNs.i18n = js.native
  def setDefaults(options: reactDashI18nextLib.reactDashI18nextMod.ReactI18NextOptions): scala.Unit = js.native
  def setI18n(instance: i18nextLib.i18nextMod.i18nextNs.i18n): scala.Unit = js.native
  def withI18n(): js.Function1[
    /* Wrapper */ reactLib.reactMod.ReactNs.ComponentType[js.Object], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Subtract[js.Object, reactDashI18nextLib.reactDashI18nextMod.WithI18n]
    ]
  ] = js.native
  def withNamespaces(): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Subtract[
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces, 
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces
      ]
    ]
  ] = js.native
  def withNamespaces(namespace: reactDashI18nextLib.Namespace): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Subtract[
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces, 
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces
      ]
    ]
  ] = js.native
  def withNamespaces(
    namespace: reactDashI18nextLib.Namespace,
    options: reactDashI18nextLib.reactDashI18nextMod.WithNamespacesOptions
  ): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Subtract[
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces, 
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces
      ]
    ]
  ] = js.native
  def withNamespaces(namespace: reactDashI18nextLib.reactDashI18nextMod.NamespaceExtractor): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Subtract[
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces, 
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces
      ]
    ]
  ] = js.native
  def withNamespaces(
    namespace: reactDashI18nextLib.reactDashI18nextMod.NamespaceExtractor,
    options: reactDashI18nextLib.reactDashI18nextMod.WithNamespacesOptions
  ): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[reactDashI18nextLib.reactDashI18nextMod.WithNamespaces], 
    reactLib.reactMod.ReactNs.ComponentType[
      reactDashI18nextLib.Subtract[
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces, 
        reactDashI18nextLib.reactDashI18nextMod.WithNamespaces
      ]
    ]
  ] = js.native
}

