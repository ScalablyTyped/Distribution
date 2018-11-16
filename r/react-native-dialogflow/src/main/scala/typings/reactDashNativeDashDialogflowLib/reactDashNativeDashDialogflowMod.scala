package typings
package reactDashNativeDashDialogflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialogflow", JSImport.Namespace)
@js.native
object reactDashNativeDashDialogflowMod extends js.Object {
  @JSName("Dialogflow")
  @js.native
  object DialogflowNs extends js.Object {
    val LANG_CHINESE_CHINA: /* zh-CN */ java.lang.String = js.native
    val LANG_CHINESE_HONGKONG: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`zh-HK` = js.native
    val LANG_CHINESE_TAIWAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`zh-TW` = js.native
    val LANG_DUTCH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.nl = js.native
    val LANG_ENGLISH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.en = js.native
    val LANG_ENGLISH_GB: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`en-GB` = js.native
    val LANG_ENGLISH_US: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`en-US` = js.native
    val LANG_FRENCH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.fr = js.native
    val LANG_GERMAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.de = js.native
    val LANG_ITALIAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.it = js.native
    val LANG_JAPANESE: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.ja = js.native
    val LANG_KOREAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.ko = js.native
    val LANG_PORTUGUESE: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.pt = js.native
    val LANG_PORTUGUESE_BRAZIL: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`pt-BR` = js.native
    val LANG_RUSSIAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.ru = js.native
    val LANG_SPANISH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.es = js.native
    val LANG_UKRAINIAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.uk = js.native
    def finishListening(): scala.Unit = js.native
    def onAudioLevel(callback: js.Function1[/* level */ scala.Double, scala.Unit]): scala.Unit = js.native
    def onListeningFinished(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def onListeningStarted(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def requestEvent(
      eventName: java.lang.String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): stdLib.Promise[_] = js.native
    def requestQuery(
      query: java.lang.String,
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): stdLib.Promise[_] = js.native
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): scala.Unit = js.native
    def setConfiguration(accessToken: java.lang.String, languageTag: java.lang.String): scala.Unit = js.native
    def setContexts(contexts: js.Array[_]): scala.Unit = js.native
    def setEntities(entities: js.Array[_]): scala.Unit = js.native
    def setPermanentContexts(contexts: js.Array[_]): scala.Unit = js.native
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): scala.Unit = js.native
  }
  
  @JSName("Dialogflow_V2")
  @js.native
  object DialogflowUnderscoreV2Ns extends js.Object {
    val LANG_CHINESE_CHINA: /* zh-CN */ java.lang.String = js.native
    val LANG_CHINESE_HONGKONG: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`zh-HK` = js.native
    val LANG_CHINESE_TAIWAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`zh-TW` = js.native
    val LANG_DUTCH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.nl = js.native
    val LANG_ENGLISH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.en = js.native
    val LANG_ENGLISH_GB: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`en-GB` = js.native
    val LANG_ENGLISH_US: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`en-US` = js.native
    val LANG_FRENCH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.fr = js.native
    val LANG_GERMAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.de = js.native
    val LANG_ITALIAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.it = js.native
    val LANG_JAPANESE: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.ja = js.native
    val LANG_KOREAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.ko = js.native
    val LANG_PORTUGUESE: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.pt = js.native
    val LANG_PORTUGUESE_BRAZIL: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.`pt-BR` = js.native
    val LANG_RUSSIAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.ru = js.native
    val LANG_SPANISH: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.es = js.native
    val LANG_UKRAINIAN: reactDashNativeDashDialogflowLib.reactDashNativeDashDialogflowLibStrings.uk = js.native
    def finishListening(): scala.Unit = js.native
    def onAudioLevel(callback: js.Function1[/* level */ scala.Double, scala.Unit]): scala.Unit = js.native
    def onListeningFinished(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def onListeningStarted(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def requestEvent(
      eventName: java.lang.String,
      eventData: js.Object,
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): stdLib.Promise[_] = js.native
    def requestQuery(
      query: java.lang.String,
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): stdLib.Promise[_] = js.native
    def resetContexts(
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): scala.Unit = js.native
    def setConfiguration(
      serviceAccount: java.lang.String,
      privateKey: java.lang.String,
      language: java.lang.String,
      projectId: java.lang.String
    ): scala.Unit = js.native
    def setContexts(contexts: js.Array[_]): scala.Unit = js.native
    def setPermanentContexts(contexts: js.Array[_]): scala.Unit = js.native
    def startListening(
      resultCallback: js.Function1[/* result */ js.Object, scala.Unit],
      errorCallback: js.Function1[/* error */ stdLib.Error, scala.Unit]
    ): scala.Unit = js.native
  }
  
}

