package typings.rrule

import typings.rrule.anon.Byeaster
import typings.rrule.anon.PartialOptions
import typings.rrule.datetimeMod.Time
import typings.rrule.typesMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseoptionsMod {
  
  @JSImport("rrule/dist/esm/src/parseoptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildTimeset(opts: ParsedOptions): js.Array[Time] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTimeset")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[Time]]
  
  @scala.inline
  def initializeOptions(options: PartialOptions): Byeaster = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Byeaster]
  
  @scala.inline
  def parseOptions(options: PartialOptions): typings.rrule.anon.ParsedOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")(options.asInstanceOf[js.Any]).asInstanceOf[typings.rrule.anon.ParsedOptions]
}
