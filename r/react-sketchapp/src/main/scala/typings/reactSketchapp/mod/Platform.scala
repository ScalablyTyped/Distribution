package typings.reactSketchapp.mod

import typings.reactSketchapp.reactSketchappNumbers.`1`
import typings.reactSketchapp.reactSketchappStrings.sketch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Platform {
  
  @JSImport("react-sketchapp", "Platform")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp", "Platform.OS")
  @js.native
  def OS: sketch = js.native
  @scala.inline
  def OS_=(x: sketch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp", "Platform.Version")
  @js.native
  def Version: `1` = js.native
  @scala.inline
  def Version_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Version")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def select(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
