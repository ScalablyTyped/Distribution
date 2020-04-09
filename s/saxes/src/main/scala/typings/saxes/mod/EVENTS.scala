package typings.saxes.mod

import org.scalablytyped.runtime.TopLevel
import typings.saxes.saxesStrings.attribute
import typings.saxes.saxesStrings.cdata
import typings.saxes.saxesStrings.closetag
import typings.saxes.saxesStrings.comment
import typings.saxes.saxesStrings.doctype
import typings.saxes.saxesStrings.end
import typings.saxes.saxesStrings.error
import typings.saxes.saxesStrings.opentag
import typings.saxes.saxesStrings.opentagstart
import typings.saxes.saxesStrings.processinginstruction
import typings.saxes.saxesStrings.ready
import typings.saxes.saxesStrings.text
import typings.saxes.saxesStrings.xmldecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saxes", "EVENTS")
@js.native
object EVENTS
  extends TopLevel[
      js.Tuple13[
        xmldecl, 
        text, 
        processinginstruction, 
        doctype, 
        comment, 
        opentagstart, 
        attribute, 
        opentag, 
        closetag, 
        cdata, 
        error, 
        end, 
        ready
      ]
    ]

