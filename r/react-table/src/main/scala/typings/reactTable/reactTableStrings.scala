package typings.reactTable

import typings.reactTable.mod.DefaultAggregators
import typings.reactTable.mod.DefaultFilterTypes
import typings.reactTable.mod.DefaultSortTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTableStrings {
  
  @js.native
  sealed trait Cell extends StObject
  inline def Cell: Cell = "Cell".asInstanceOf[Cell]
  
  @js.native
  sealed trait Footer extends StObject
  inline def Footer: Footer = "Footer".asInstanceOf[Footer]
  
  @js.native
  sealed trait Header extends StObject
  inline def Header: Header = "Header".asInstanceOf[Header]
  
  @js.native
  sealed trait alphanumeric
    extends StObject
       with DefaultSortTypes
  inline def alphanumeric: alphanumeric = "alphanumeric".asInstanceOf[alphanumeric]
  
  @js.native
  sealed trait average
    extends StObject
       with DefaultAggregators
  inline def average: average = "average".asInstanceOf[average]
  
  @js.native
  sealed trait basic
    extends StObject
       with DefaultSortTypes
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait between
    extends StObject
       with DefaultFilterTypes
  inline def between: between = "between".asInstanceOf[between]
  
  @js.native
  sealed trait count
    extends StObject
       with DefaultAggregators
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait datetime
    extends StObject
       with DefaultSortTypes
  inline def datetime: datetime = "datetime".asInstanceOf[datetime]
  
  @js.native
  sealed trait equals
    extends StObject
       with DefaultFilterTypes
  inline def equals: equals = "equals".asInstanceOf[equals]
  
  @js.native
  sealed trait exact
    extends StObject
       with DefaultFilterTypes
  inline def exact: exact = "exact".asInstanceOf[exact]
  
  @js.native
  sealed trait exactText
    extends StObject
       with DefaultFilterTypes
  inline def exactText: exactText = "exactText".asInstanceOf[exactText]
  
  @js.native
  sealed trait exactTextCase
    extends StObject
       with DefaultFilterTypes
  inline def exactTextCase: exactTextCase = "exactTextCase".asInstanceOf[exactTextCase]
  
  @js.native
  sealed trait includes
    extends StObject
       with DefaultFilterTypes
  inline def includes: includes = "includes".asInstanceOf[includes]
  
  @js.native
  sealed trait includesAll
    extends StObject
       with DefaultFilterTypes
  inline def includesAll: includesAll = "includesAll".asInstanceOf[includesAll]
  
  @js.native
  sealed trait median
    extends StObject
       with DefaultAggregators
  inline def median: median = "median".asInstanceOf[median]
  
  @js.native
  sealed trait number
    extends StObject
       with DefaultSortTypes
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait string
    extends StObject
       with DefaultSortTypes
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait sum
    extends StObject
       with DefaultAggregators
  inline def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait text
    extends StObject
       with DefaultFilterTypes
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait uniqueCount
    extends StObject
       with DefaultAggregators
  inline def uniqueCount: uniqueCount = "uniqueCount".asInstanceOf[uniqueCount]
}
