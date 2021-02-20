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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Dialogflow {
    
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
    
    @JSImport("react-native-dialogflow", "Dialogflow.finishListening")
    @js.native
    def finishListening(): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.onAudioLevel")
    @js.native
    def onAudioLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.onListeningFinished")
    @js.native
    def onListeningFinished(callback: js.Function0[Unit]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.onListeningStarted")
    @js.native
    def onListeningStarted(callback: js.Function0[Unit]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.requestEvent")
    @js.native
    def requestEvent(
      eventName: String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.requestQuery")
    @js.native
    def requestQuery(
      query: String,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.resetContexts")
    @js.native
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.setConfiguration")
    @js.native
    def setConfiguration(accessToken: String, languageTag: String): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.setContexts")
    @js.native
    def setContexts(contexts: js.Array[_]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.setEntities")
    @js.native
    def setEntities(entities: js.Array[_]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.setPermanentContexts")
    @js.native
    def setPermanentContexts(contexts: js.Array[_]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow.startListening")
    @js.native
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
  }
  
  object DialogflowV2 {
    
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
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.finishListening")
    @js.native
    def finishListening(): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.onAudioLevel")
    @js.native
    def onAudioLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.onListeningFinished")
    @js.native
    def onListeningFinished(callback: js.Function0[Unit]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.onListeningStarted")
    @js.native
    def onListeningStarted(callback: js.Function0[Unit]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.requestEvent")
    @js.native
    def requestEvent(
      eventName: String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.requestQuery")
    @js.native
    def requestQuery(
      query: String,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.resetContexts")
    @js.native
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.setConfiguration")
    @js.native
    def setConfiguration(serviceAccount: String, privateKey: String, language: String, projectId: String): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.setContexts")
    @js.native
    def setContexts(contexts: js.Array[_]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.setPermanentContexts")
    @js.native
    def setPermanentContexts(contexts: js.Array[_]): Unit = js.native
    
    @JSImport("react-native-dialogflow", "Dialogflow_V2.startListening")
    @js.native
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
  }
}
