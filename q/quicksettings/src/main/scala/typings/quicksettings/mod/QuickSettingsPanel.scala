package typings.quicksettings.mod

import typings.quicksettings.quicksettingsBooleans.`false`
import typings.quicksettings.quicksettingsBooleans.`true`
import typings.quicksettings.quicksettingsStrings.numbers
import typings.quicksettings.quicksettingsStrings.percent
import typings.std.Date
import typings.std.File
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickSettingsPanel[M, S] extends js.Object {
  def addBoolean(title: KeyWhereType[M, Boolean], value: Boolean): this.type = js.native
  def addBoolean(title: KeyWhereType[M, Boolean], value: Boolean, callback: ChangeHandler[Boolean]): this.type = js.native
  def addButton(title: S): this.type = js.native
  def addButton(title: S, callback: js.Function0[Unit]): this.type = js.native
  def addColor(title: KeyWhereType[M, String], color: String): this.type = js.native
  def addColor(title: KeyWhereType[M, String], color: String, callback: ChangeHandler[String]): this.type = js.native
  def addDate[K /* <: KeyWhereType[M, String | Date] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any */](title: K, date: V): this.type = js.native
  def addDate[K /* <: KeyWhereType[M, String | Date] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any */](title: K, date: V, callback: ChangeHandler[V]): this.type = js.native
  def addDropDown[K /* <: /* keyof M */ String */](
    title: K,
    items: DropDownItems[
      /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
    ]
  ): this.type = js.native
  def addDropDown[K /* <: /* keyof M */ String */](
    title: K,
    items: DropDownItems[
      /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
    ],
    callback: ChangeHandler[
      DropDownSelection[
        /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
      ]
    ]
  ): this.type = js.native
  def addElement(title: S, element: HTMLElement): this.type = js.native
  def addFileChooser(title: KeyWhereType[M, File], labelStr: String, filter: String): this.type = js.native
  def addFileChooser(title: KeyWhereType[M, File], labelStr: String, filter: String, callback: ChangeHandler[File]): this.type = js.native
  def addHTML(title: KeyWhereType[M, String], html: String): this.type = js.native
  def addImage(title: KeyWhereType[M, String], imageUrl: String): this.type = js.native
  def addImage(title: KeyWhereType[M, String], imageUrl: String, callback: ChangeHandler[String]): this.type = js.native
  def addNumber(title: KeyWhereType[M, Double], min: Double, max: Double, value: Double, step: Double): this.type = js.native
  def addNumber(
    title: KeyWhereType[M, Double],
    min: Double,
    max: Double,
    value: Double,
    step: Double,
    callback: ChangeHandler[Double]
  ): this.type = js.native
  def addPassword(title: KeyWhereType[M, String], text: String): this.type = js.native
  def addPassword(title: KeyWhereType[M, String], text: String, callback: ChangeHandler[String]): this.type = js.native
  def addProgressBar(title: String, max: Double, value: Double): this.type = js.native
  @JSName("addProgressBar")
  def addProgressBar_numbers(title: String, max: Double, value: Double, valueDisplay: numbers): this.type = js.native
  @JSName("addProgressBar")
  def addProgressBar_percent(title: String, max: Double, value: Double, valueDisplay: percent): this.type = js.native
  def addRange(title: KeyWhereType[M, Double], min: Double, max: Double, value: Double, step: Double): this.type = js.native
  def addRange(
    title: KeyWhereType[M, Double],
    min: Double,
    max: Double,
    value: Double,
    step: Double,
    callback: ChangeHandler[Double]
  ): this.type = js.native
  def addText(title: KeyWhereType[M, String], text: String): this.type = js.native
  def addText(title: KeyWhereType[M, String], text: String, callback: ChangeHandler[String]): this.type = js.native
  def addTextArea(title: KeyWhereType[M, String], text: String): this.type = js.native
  def addTextArea(title: KeyWhereType[M, String], text: String, callback: ChangeHandler[String]): this.type = js.native
  def addTime[K /* <: KeyWhereType[M, String | Date] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any */](title: K, date: V): this.type = js.native
  def addTime[K /* <: KeyWhereType[M, String | Date] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any */](title: K, date: V, callback: ChangeHandler[V]): this.type = js.native
  def bindBoolean[K /* <: KeyWhereType[M, Boolean] */](title: K, value: Boolean, `object`: Record[K, Boolean]): this.type = js.native
  def bindColor[K /* <: KeyWhereType[M, String] */](title: K, color: String, `object`: Record[K, String]): this.type = js.native
  def bindDate[K /* <: KeyWhereType[M, String | Date] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any */](title: K, date: V, `object`: Record[K, V]): this.type = js.native
  def bindDropDown[K /* <: /* keyof M */ String */](
    title: K,
    items: DropDownItems[
      /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
    ],
    `object`: Pick[M, K]
  ): this.type = js.native
  def bindNumber[K /* <: KeyWhereType[M, Double] */](title: K, min: Double, max: Double, value: Double, step: Double, `object`: Record[K, Double]): this.type = js.native
  def bindPassword[K /* <: KeyWhereType[M, String] */](title: K, text: String, `object`: Record[K, String]): this.type = js.native
  def bindRange[K /* <: KeyWhereType[M, Double] */](title: K, min: Double, max: Double, value: Double, step: Double, `object`: Record[K, Double]): this.type = js.native
  def bindText[K /* <: KeyWhereType[M, String] */](title: K, text: String, `object`: Record[K, String]): this.type = js.native
  def bindTextArea[K /* <: KeyWhereType[M, String] */](title: K, text: String, `object`: Record[K, String]): this.type = js.native
  def bindTime[K /* <: KeyWhereType[M, String | Date] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any */](title: K, date: V, `object`: Record[K, V]): this.type = js.native
  def clearLocalStorage(name: String): this.type = js.native
  def collapse(): this.type = js.native
  def destroy(): Unit = js.native
  def disableControl(title: S): this.type = js.native
  def disableControl(title: /* keyof M */ String): this.type = js.native
  def enableControl(title: S): this.type = js.native
  def enableControl(title: /* keyof M */ String): this.type = js.native
  def expand(): this.type = js.native
  def getValue[K /* <: /* keyof M */ String */](title: K): /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any = js.native
  def getValuesAsJSON(): M = js.native
  @JSName("getValuesAsJSON")
  def getValuesAsJSON_false(asString: `false`): M = js.native
  @JSName("getValuesAsJSON")
  def getValuesAsJSON_true(asString: `true`): String = js.native
  def hide(): this.type = js.native
  def hideAllTitles(): this.type = js.native
  def hideControl(title: S): this.type = js.native
  def hideControl(title: /* keyof M */ String): this.type = js.native
  def hideTitle(title: S): this.type = js.native
  def hideTitle(title: /* keyof M */ String): this.type = js.native
  def overrideStyle(title: S, style: String, value: String): this.type = js.native
  def overrideStyle(title: /* keyof M */ String, style: String, value: String): this.type = js.native
  def removeControl(title: S): this.type = js.native
  def removeControl(title: /* keyof M */ String): this.type = js.native
  def saveInLocalStorage(name: String): this.type = js.native
  def setCollapsible(collapsible: Boolean): this.type = js.native
  def setDraggable(draggable: Boolean): this.type = js.native
  def setGlobalChangeHandler(handler: ChangeHandler[M]): this.type = js.native
  def setHeight(h: Double): this.type = js.native
  def setKey(char: String): this.type = js.native
  def setNumberParameters(title: KeyWhereType[M, Double], min: Double, max: Double, step: Double): this.type = js.native
  def setPosition(x: Double, y: Double): this.type = js.native
  def setProgressMax(title: String, max: Double): this.type = js.native
  def setRangeParameters(title: KeyWhereType[M, Double], min: Double, max: Double, step: Double): this.type = js.native
  def setSize(w: Double, h: Double): this.type = js.native
  def setTextAreaRows(title: KeyWhereType[M, String], rows: Double): this.type = js.native
  def setValue[K /* <: /* keyof M */ String */](
    title: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
  ): this.type = js.native
  def setValuesFromJSON(json: M): this.type = js.native
  def setValuesFromJSON(json: String): this.type = js.native
  def setWidth(w: Double): this.type = js.native
  def show(): this.type = js.native
  def showAllTitles(): this.type = js.native
  def showControl(title: S): this.type = js.native
  def showControl(title: /* keyof M */ String): this.type = js.native
  def showTitle(title: S): this.type = js.native
  def showTitle(title: /* keyof M */ String): this.type = js.native
  def toggleCollapsed(): this.type = js.native
  def toggleVisibility(): this.type = js.native
}

