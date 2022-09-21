package typings.sitemapGenerator

import typings.sitemapGenerator.mod.EventTypes
import typings.sitemapGenerator.mod.FreqValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sitemapGeneratorStrings {
  
  @js.native
  sealed trait add
    extends StObject
       with EventTypes
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait always
    extends StObject
       with FreqValues
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait daily
    extends StObject
       with FreqValues
  inline def daily: daily = "daily".asInstanceOf[daily]
  
  @js.native
  sealed trait done
    extends StObject
       with EventTypes
  inline def done: done = "done".asInstanceOf[done]
  
  @js.native
  sealed trait error
    extends StObject
       with EventTypes
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait hourly
    extends StObject
       with FreqValues
  inline def hourly: hourly = "hourly".asInstanceOf[hourly]
  
  @js.native
  sealed trait ignore
    extends StObject
       with EventTypes
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait monthly
    extends StObject
       with FreqValues
  inline def monthly: monthly = "monthly".asInstanceOf[monthly]
  
  @js.native
  sealed trait never
    extends StObject
       with FreqValues
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait weekly
    extends StObject
       with FreqValues
  inline def weekly: weekly = "weekly".asInstanceOf[weekly]
  
  @js.native
  sealed trait yearly
    extends StObject
       with FreqValues
  inline def yearly: yearly = "yearly".asInstanceOf[yearly]
}
