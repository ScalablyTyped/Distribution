package typings.reactDashBootstrapDashTable

import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.BootstrapVersion
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.CSVFieldType
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.CellEditClickMode
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.DataAlignType
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.DropDirection
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.EditCellType
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.EditValidatorType
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ExpandBy
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.FilterComparator
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.FilterCondition
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.FilterType
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.PaginationPostion
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.ScrollPosition
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SelectRowMode
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashBootstrapDashTableStrings {
  @js.native
  sealed trait `3` extends BootstrapVersion
  
  @js.native
  sealed trait `4` extends BootstrapVersion
  
  @js.native
  sealed trait ArrayFilter extends FilterType
  
  @js.native
  sealed trait Bottom extends ScrollPosition
  
  @js.native
  sealed trait CustomFilter extends FilterType
  
  @js.native
  sealed trait DateFilter extends FilterType
  
  @js.native
  sealed trait Equalssign extends FilterComparator
  
  @js.native
  sealed trait ExclamationmarkEqualssign extends FilterComparator
  
  @js.native
  sealed trait Greaterthansign extends FilterComparator
  
  @js.native
  sealed trait GreaterthansignEqualssign extends FilterComparator
  
  @js.native
  sealed trait Lessthansign extends FilterComparator
  
  @js.native
  sealed trait LessthansignEqualssign extends FilterComparator
  
  @js.native
  sealed trait NumberFilter extends FilterType
  
  @js.native
  sealed trait RegexFilter extends FilterType
  
  @js.native
  sealed trait SelectFilter extends FilterType
  
  @js.native
  sealed trait TextFilter extends FilterType
  
  @js.native
  sealed trait Top extends ScrollPosition
  
  @js.native
  sealed trait asc extends SortOrder
  
  @js.native
  sealed trait both extends PaginationPostion
  
  @js.native
  sealed trait bottom_ extends PaginationPostion
  
  @js.native
  sealed trait center extends DataAlignType
  
  @js.native
  sealed trait checkbox
    extends EditCellType
       with SelectRowMode
  
  @js.native
  sealed trait click extends CellEditClickMode
  
  @js.native
  sealed trait column extends ExpandBy
  
  @js.native
  sealed trait datetime extends EditCellType
  
  @js.native
  sealed trait dbclick extends CellEditClickMode
  
  @js.native
  sealed trait desc extends SortOrder
  
  @js.native
  sealed trait dropdown extends DropDirection
  
  @js.native
  sealed trait dropup extends DropDirection
  
  @js.native
  sealed trait end extends DataAlignType
  
  @js.native
  sealed trait eq extends FilterCondition
  
  @js.native
  sealed trait error extends EditValidatorType
  
  @js.native
  sealed trait left extends DataAlignType
  
  @js.native
  sealed trait like extends FilterCondition
  
  @js.native
  sealed trait none
    extends CellEditClickMode
       with SelectRowMode
  
  @js.native
  sealed trait number extends CSVFieldType
  
  @js.native
  sealed trait radio extends SelectRowMode
  
  @js.native
  sealed trait right extends DataAlignType
  
  @js.native
  sealed trait row extends ExpandBy
  
  @js.native
  sealed trait select extends EditCellType
  
  @js.native
  sealed trait start extends DataAlignType
  
  @js.native
  sealed trait string extends CSVFieldType
  
  @js.native
  sealed trait success extends EditValidatorType
  
  @js.native
  sealed trait textarea extends EditCellType
  
  @js.native
  sealed trait top_ extends PaginationPostion
  
  @scala.inline
  def `3`: `3` = "3".asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = "4".asInstanceOf[`4`]
  @scala.inline
  def ArrayFilter: ArrayFilter = "ArrayFilter".asInstanceOf[ArrayFilter]
  @scala.inline
  def Bottom: Bottom = "Bottom".asInstanceOf[Bottom]
  @scala.inline
  def CustomFilter: CustomFilter = "CustomFilter".asInstanceOf[CustomFilter]
  @scala.inline
  def DateFilter: DateFilter = "DateFilter".asInstanceOf[DateFilter]
  @scala.inline
  def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  @scala.inline
  def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  @scala.inline
  def NumberFilter: NumberFilter = "NumberFilter".asInstanceOf[NumberFilter]
  @scala.inline
  def RegexFilter: RegexFilter = "RegexFilter".asInstanceOf[RegexFilter]
  @scala.inline
  def SelectFilter: SelectFilter = "SelectFilter".asInstanceOf[SelectFilter]
  @scala.inline
  def TextFilter: TextFilter = "TextFilter".asInstanceOf[TextFilter]
  @scala.inline
  def Top: Top = "Top".asInstanceOf[Top]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  @scala.inline
  def bottom_ : bottom_ = "bottom".asInstanceOf[bottom_]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  @scala.inline
  def dbclick: dbclick = "dbclick".asInstanceOf[dbclick]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  @scala.inline
  def dropup: dropup = "dropup".asInstanceOf[dropup]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def eq: eq = "eq".asInstanceOf[eq]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def like: like = "like".asInstanceOf[like]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  @scala.inline
  def top_ : top_ = "top".asInstanceOf[top_]
}

