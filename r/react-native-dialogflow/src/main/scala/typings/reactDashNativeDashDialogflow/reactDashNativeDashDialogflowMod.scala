package typings.reactDashNativeDashDialogflow

import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.`en-GB`
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.`en-US`
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.`pt-BR`
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.`zh-CN`
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.`zh-HK`
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.`zh-TW`
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.de
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.en
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.es
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.fr
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.it
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.ja
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.ko
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.nl
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.pt
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.ru
import typings.reactDashNativeDashDialogflow.reactDashNativeDashDialogflowStrings.uk
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialogflow", JSImport.Namespace)
@js.native
object reactDashNativeDashDialogflowMod extends js.Object {
  @JSName("Dialogflow")
  @js.native
  object DialogflowNs extends js.Object {
    val LANG_CHINESE_CHINA: `zh-CN` = js.native
    val LANG_CHINESE_HONGKONG: `zh-HK` = js.native
    val LANG_CHINESE_TAIWAN: `zh-TW` = js.native
    val LANG_DUTCH: nl = js.native
    val LANG_ENGLISH: en = js.native
    val LANG_ENGLISH_GB: `en-GB` = js.native
    val LANG_ENGLISH_US: `en-US` = js.native
    val LANG_FRENCH: fr = js.native
    val LANG_GERMAN: de = js.native
    val LANG_ITALIAN: it = js.native
    val LANG_JAPANESE: ja = js.native
    val LANG_KOREAN: ko = js.native
    val LANG_PORTUGUESE: pt = js.native
    val LANG_PORTUGUESE_BRAZIL: `pt-BR` = js.native
    val LANG_RUSSIAN: ru = js.native
    val LANG_SPANISH: es = js.native
    val LANG_UKRAINIAN: uk = js.native
    def finishListening(): Unit = js.native
    def onAudioLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = js.native
    def onListeningFinished(callback: js.Function0[Unit]): Unit = js.native
    def onListeningStarted(callback: js.Function0[Unit]): Unit = js.native
    def requestEvent(
      eventName: String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    def requestQuery(
      query: String,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    def setConfiguration(accessToken: String, languageTag: String): Unit = js.native
    def setContexts(contexts: js.Array[_]): Unit = js.native
    def setEntities(entities: js.Array[_]): Unit = js.native
    def setPermanentContexts(contexts: js.Array[_]): Unit = js.native
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
  }
  
  @JSName("Dialogflow_V2")
  @js.native
  object DialogflowUnderscoreV2Ns extends js.Object {
    val LANG_CHINESE_CHINA: `zh-CN` = js.native
    val LANG_CHINESE_HONGKONG: `zh-HK` = js.native
    val LANG_CHINESE_TAIWAN: `zh-TW` = js.native
    val LANG_DUTCH: nl = js.native
    val LANG_ENGLISH: en = js.native
    val LANG_ENGLISH_GB: `en-GB` = js.native
    val LANG_ENGLISH_US: `en-US` = js.native
    val LANG_FRENCH: fr = js.native
    val LANG_GERMAN: de = js.native
    val LANG_ITALIAN: it = js.native
    val LANG_JAPANESE: ja = js.native
    val LANG_KOREAN: ko = js.native
    val LANG_PORTUGUESE: pt = js.native
    val LANG_PORTUGUESE_BRAZIL: `pt-BR` = js.native
    val LANG_RUSSIAN: ru = js.native
    val LANG_SPANISH: es = js.native
    val LANG_UKRAINIAN: uk = js.native
    def finishListening(): Unit = js.native
    def onAudioLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = js.native
    def onListeningFinished(callback: js.Function0[Unit]): Unit = js.native
    def onListeningStarted(callback: js.Function0[Unit]): Unit = js.native
    def requestEvent(
      eventName: String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    def requestQuery(
      query: String,
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[_] = js.native
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    def setConfiguration(serviceAccount: String, privateKey: String, language: String, projectId: String): Unit = js.native
    def setContexts(contexts: js.Array[_]): Unit = js.native
    def setPermanentContexts(contexts: js.Array[_]): Unit = js.native
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, Unit],
      errorCallback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
  }
  
}

