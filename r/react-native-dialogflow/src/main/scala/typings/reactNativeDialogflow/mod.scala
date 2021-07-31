package typings.reactNativeDialogflow

import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`en-GB`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`en-US`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`pt-BR`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`zh-HK`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`zh-TW`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.de
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.en
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.es
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.fr
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.it
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.ja
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.ko
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.nl
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.pt
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.ru
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.uk
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Dialogflow {
    
    @JSImport("react-native-dialogflow", "Dialogflow")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_CHINESE_CHINA")
    @js.native
    val LANG_CHINESE_CHINA: /* "zh-CN" */ String = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_CHINESE_HONGKONG")
    @js.native
    val LANG_CHINESE_HONGKONG: `zh-HK` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_CHINESE_TAIWAN")
    @js.native
    val LANG_CHINESE_TAIWAN: `zh-TW` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_DUTCH")
    @js.native
    val LANG_DUTCH: nl = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_ENGLISH")
    @js.native
    val LANG_ENGLISH: en = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_ENGLISH_GB")
    @js.native
    val LANG_ENGLISH_GB: `en-GB` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_ENGLISH_US")
    @js.native
    val LANG_ENGLISH_US: `en-US` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_FRENCH")
    @js.native
    val LANG_FRENCH: fr = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_GERMAN")
    @js.native
    val LANG_GERMAN: de = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_ITALIAN")
    @js.native
    val LANG_ITALIAN: it = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_JAPANESE")
    @js.native
    val LANG_JAPANESE: ja = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_KOREAN")
    @js.native
    val LANG_KOREAN: ko = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_PORTUGUESE")
    @js.native
    val LANG_PORTUGUESE: pt = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_PORTUGUESE_BRAZIL")
    @js.native
    val LANG_PORTUGUESE_BRAZIL: `pt-BR` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_RUSSIAN")
    @js.native
    val LANG_RUSSIAN: ru = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_SPANISH")
    @js.native
    val LANG_SPANISH: es = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.LANG_UKRAINIAN")
    @js.native
    val LANG_UKRAINIAN: uk = js.native
    
    @scala.inline
    def finishListening(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("finishListening")().asInstanceOf[Unit]
    
    @scala.inline
    def onAudioLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAudioLevel")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onListeningFinished(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onListeningFinished")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onListeningStarted(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onListeningStarted")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def requestEvent(
      eventName: String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestEvent")(eventName.asInstanceOf[js.Any], eventData.asInstanceOf[js.Any], resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def requestQuery(
      query: String,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestQuery")(query.asInstanceOf[js.Any], resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetContexts")(resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setConfiguration(accessToken: String, languageTag: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfiguration")(accessToken.asInstanceOf[js.Any], languageTag.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setContexts(contexts: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContexts")(contexts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setEntities(entities: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEntities")(entities.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setPermanentContexts(contexts: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPermanentContexts")(contexts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startListening")(resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object DialogflowV2 {
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_CHINESE_CHINA")
    @js.native
    val LANG_CHINESE_CHINA: /* "zh-CN" */ String = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_CHINESE_HONGKONG")
    @js.native
    val LANG_CHINESE_HONGKONG: `zh-HK` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_CHINESE_TAIWAN")
    @js.native
    val LANG_CHINESE_TAIWAN: `zh-TW` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_DUTCH")
    @js.native
    val LANG_DUTCH: nl = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_ENGLISH")
    @js.native
    val LANG_ENGLISH: en = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_ENGLISH_GB")
    @js.native
    val LANG_ENGLISH_GB: `en-GB` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_ENGLISH_US")
    @js.native
    val LANG_ENGLISH_US: `en-US` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_FRENCH")
    @js.native
    val LANG_FRENCH: fr = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_GERMAN")
    @js.native
    val LANG_GERMAN: de = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_ITALIAN")
    @js.native
    val LANG_ITALIAN: it = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_JAPANESE")
    @js.native
    val LANG_JAPANESE: ja = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_KOREAN")
    @js.native
    val LANG_KOREAN: ko = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_PORTUGUESE")
    @js.native
    val LANG_PORTUGUESE: pt = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_PORTUGUESE_BRAZIL")
    @js.native
    val LANG_PORTUGUESE_BRAZIL: `pt-BR` = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_RUSSIAN")
    @js.native
    val LANG_RUSSIAN: ru = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_SPANISH")
    @js.native
    val LANG_SPANISH: es = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.LANG_UKRAINIAN")
    @js.native
    val LANG_UKRAINIAN: uk = js.native
    
    @scala.inline
    def finishListening(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("finishListening")().asInstanceOf[Unit]
    
    @scala.inline
    def onAudioLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAudioLevel")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onListeningFinished(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onListeningFinished")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onListeningStarted(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onListeningStarted")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def requestEvent(
      eventName: String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestEvent")(eventName.asInstanceOf[js.Any], eventData.asInstanceOf[js.Any], resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def requestQuery(
      query: String,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestQuery")(query.asInstanceOf[js.Any], resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetContexts")(resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setConfiguration(serviceAccount: String, privateKey: String, language: String, projectId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfiguration")(serviceAccount.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], language.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setContexts(contexts: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContexts")(contexts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setPermanentContexts(contexts: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPermanentContexts")(contexts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startListening")(resultCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
