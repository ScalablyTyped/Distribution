package typings.reactTimeago

import typings.reactTimeago.mod.Suffix
import typings.reactTimeago.mod.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTimeagoStrings {
  
  @js.native
  sealed trait ago
    extends StObject
       with Suffix
  @scala.inline
  def ago: ago = "ago".asInstanceOf[ago]
  
  @js.native
  sealed trait day
    extends StObject
       with Unit
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait `from now`
    extends StObject
       with Suffix
  @scala.inline
  def `from now`: `from now` = ("from now").asInstanceOf[`from now`]
  
  @js.native
  sealed trait hour
    extends StObject
       with Unit
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait minute
    extends StObject
       with Unit
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait month
    extends StObject
       with Unit
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait second
    extends StObject
       with Unit
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  
  @js.native
  sealed trait week
    extends StObject
       with Unit
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait year
    extends StObject
       with Unit
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}
