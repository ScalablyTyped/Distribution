package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Painters {
  
  @JSImport("seen", "Painters")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("seen", "Painters.path")
  @js.native
  def path: PathPainter = js.native
  @scala.inline
  def path_=(x: PathPainter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
  
  @JSImport("seen", "Painters.text")
  @js.native
  def text: TextPainter = js.native
  @scala.inline
  def text_=(x: TextPainter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
}
