package typings.quicksettings

import org.scalablytyped.runtime.Shortcut
import typings.quicksettings.quicksettingsBooleans.`false`
import typings.quicksettings.quicksettingsBooleans.`true`
import typings.quicksettings.quicksettingsStrings.numbers
import typings.quicksettings.quicksettingsStrings.percent
import typings.std.Date
import typings.std.File
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("quicksettings", JSImport.Default)
  @js.native
  val default: QuickSettings = js.native
  
  type AnyModel = Record[String, js.Any]
  
  type ChangeHandler[T] = js.Function1[/* value */ T, Unit]
  
  type DropDownItems[T] = js.Array[(T & (String | Double)) | DropDownOption[T]]
  
  trait DropDownOption[T] extends StObject {
    
    var label: String | Double
    
    var value: T
  }
  object DropDownOption {
    
    @scala.inline
    def apply[T](label: String | Double, value: T): DropDownOption[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownOption[T]]
    }
    
    @scala.inline
    implicit class DropDownOptionMutableBuilder[Self <: DropDownOption[?], T] (val x: Self & DropDownOption[T]) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropDownSelection[T] extends StObject {
    
    var index: Double
    
    var label: String
    
    var value: T
  }
  object DropDownSelection {
    
    @scala.inline
    def apply[T](index: Double, label: String, value: T): DropDownSelection[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownSelection[T]]
    }
    
    @scala.inline
    implicit class DropDownSelectionMutableBuilder[Self <: DropDownSelection[?], T] (val x: Self & DropDownSelection[T]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Mapped type picking only the properties of the type `M` whose value declaration extends `V`
    */
  type KeyWhereType[M, V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof M ]: M[K] extends V? K : never}[keyof M] */ js.Any
  
  @js.native
  trait QuickSettings extends StObject {
    
    /**
      * Creates a QuickSettingsPanel with the provided parameters.
      *
      * @template    M           The type of the model that is being managed by the quick settings.
      * @template    S           Type of names of controls that do not attach to the model (e.g., button or element)
      * @param       x           x position of panel (default 0)
      * @param       y           y position of panel (default 0)
      * @param       panelTitle  title of panel (default "QuickSettings")
      * @param       parent      title of panel (default "QuickSettings")
      * @returns                 New QuickSettings Panel
      */
    def create[M, S](): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double, y: Double): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double, y: Double, panelTitle: String): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double, y: Double, panelTitle: String, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double, y: Double, panelTitle: Unit, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double, y: Unit, panelTitle: String): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double, y: Unit, panelTitle: String, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Double, y: Unit, panelTitle: Unit, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Unit, y: Double): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Unit, y: Double, panelTitle: String): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Unit, y: Double, panelTitle: String, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Unit, y: Double, panelTitle: Unit, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Unit, y: Unit, panelTitle: String): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Unit, y: Unit, panelTitle: String, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    def create[M, S](x: Unit, y: Unit, panelTitle: Unit, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
    
    // tslint:disable-line no-unnecessary-generics
    def useExtStyleSheet(): Unit = js.native
  }
  
  @js.native
  trait QuickSettingsPanel[M, S] extends StObject {
    
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
  
  type _To = QuickSettings
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: QuickSettings = default
}
