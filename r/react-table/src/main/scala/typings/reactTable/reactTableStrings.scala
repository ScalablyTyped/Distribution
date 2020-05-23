package typings.reactTable

import typings.reactTable.mod.DefaultAggregators
import typings.reactTable.mod.DefaultFilterTypes
import typings.reactTable.mod.DefaultSortTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactTableStrings {
  @js.native
  sealed trait Cell extends js.Object
  
  @js.native
  sealed trait ColumnWithStrictAccessor extends js.Object
  
  @js.native
  sealed trait Footer extends js.Object
  
  @js.native
  sealed trait Header extends js.Object
  
  @js.native
  sealed trait alphanumeric extends DefaultSortTypes
  
  @js.native
  sealed trait average extends DefaultAggregators
  
  @js.native
  sealed trait basic extends DefaultSortTypes
  
  @js.native
  sealed trait between extends DefaultFilterTypes
  
  @js.native
  sealed trait count extends DefaultAggregators
  
  @js.native
  sealed trait datetime extends DefaultSortTypes
  
  @js.native
  sealed trait equals extends DefaultFilterTypes
  
  @js.native
  sealed trait exact extends DefaultFilterTypes
  
  @js.native
  sealed trait exactText extends DefaultFilterTypes
  
  @js.native
  sealed trait exactTextCase extends DefaultFilterTypes
  
  @js.native
  sealed trait includes extends DefaultFilterTypes
  
  @js.native
  sealed trait includesAll extends DefaultFilterTypes
  
  @js.native
  sealed trait median extends DefaultAggregators
  
  @js.native
  sealed trait sum extends DefaultAggregators
  
  @js.native
  sealed trait text extends DefaultFilterTypes
  
  @js.native
  sealed trait uniqueCount extends DefaultAggregators
  
  @scala.inline
  def Cell: Cell = "Cell".asInstanceOf[Cell]
  @scala.inline
  def ColumnWithStrictAccessor: ColumnWithStrictAccessor = "ColumnWithStrictAccessor".asInstanceOf[ColumnWithStrictAccessor]
  @scala.inline
  def Footer: Footer = "Footer".asInstanceOf[Footer]
  @scala.inline
  def Header: Header = "Header".asInstanceOf[Header]
  @scala.inline
  def alphanumeric: alphanumeric = "alphanumeric".asInstanceOf[alphanumeric]
  @scala.inline
  def average: average = "average".asInstanceOf[average]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def between: between = "between".asInstanceOf[between]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  @scala.inline
  def equals: equals = "equals".asInstanceOf[equals]
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  @scala.inline
  def exactText: exactText = "exactText".asInstanceOf[exactText]
  @scala.inline
  def exactTextCase: exactTextCase = "exactTextCase".asInstanceOf[exactTextCase]
  @scala.inline
  def includes: includes = "includes".asInstanceOf[includes]
  @scala.inline
  def includesAll: includesAll = "includesAll".asInstanceOf[includesAll]
  @scala.inline
  def median: median = "median".asInstanceOf[median]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def uniqueCount: uniqueCount = "uniqueCount".asInstanceOf[uniqueCount]
}

