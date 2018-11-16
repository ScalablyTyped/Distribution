package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Style")
@js.native
class Style () extends js.Object

@JSGlobal("SP.JsGrid.Style")
@js.native
object Style extends js.Object {
  var Type: sharepointLib.Anon_TimescaleTier = js.native
  def ApplyCellStyle(td: stdLib.HTMLTableCellElement, style: js.Any): scala.Unit = js.native
  def ApplyColumnContextMenuStyle(domObj: stdLib.HTMLElement, style: js.Any): scala.Unit = js.native
  def ApplyCornerHeaderBorderStyle(domObj: stdLib.HTMLElement, colStyle: js.Any, rowStyle: js.Any): scala.Unit = js.native
  def ApplyHeaderInnerBorderStyle(domObj: stdLib.HTMLElement, bIsRowHeader: js.Any, headerObject: js.Any): scala.Unit = js.native
  def ApplyRowHeaderStyle(
    domObj: stdLib.HTMLElement,
    style: js.Any,
    fnGetHeaderSibling: js.Function2[/* elem */ stdLib.HTMLElement, /* previousElem */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def ApplySplitterStyle(domObj: stdLib.HTMLElement, style: js.Any): scala.Unit = js.native
  def CreateStyle(styleType: sharepointLib.SPNs.JsGridNs.IStyleType, styleProps: js.Any): js.Any = js.native
  def CreateStyleFromCss(styleType: sharepointLib.SPNs.JsGridNs.IStyleType, cssStyleName: java.lang.String): js.Any = js.native
  def CreateStyleFromCss(
    styleType: sharepointLib.SPNs.JsGridNs.IStyleType,
    cssStyleName: java.lang.String,
    optExistingStyle: js.Any
  ): js.Any = js.native
  def CreateStyleFromCss(
    styleType: sharepointLib.SPNs.JsGridNs.IStyleType,
    cssStyleName: java.lang.String,
    optExistingStyle: js.Any,
    optClassId: js.Any
  ): js.Any = js.native
  def GetCellStyleDefaultBackgroundColor(): java.lang.String = js.native
  def MakeBorderString(width: scala.Double, style: java.lang.String, color: java.lang.String): java.lang.String = js.native
  def MakeJsGridStyleManager(): sharepointLib.SPNs.JsGridNs.IStyleManager = js.native
  def MergeCellStyles(majorStyle: js.Any, minorStyle: js.Any): js.Any = js.native
  def SetRTL(rtlObject: js.Any): scala.Unit = js.native
}

