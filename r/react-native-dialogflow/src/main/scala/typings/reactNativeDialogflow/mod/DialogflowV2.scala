package typings.reactNativeDialogflow.mod

import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`en-GB`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`en-US`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`pt-BR`
import typings.reactNativeDialogflow.reactNativeDialogflowStrings.`zh-CN`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialogflow", "Dialogflow_V2")
@js.native
object DialogflowV2 extends js.Object {
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

