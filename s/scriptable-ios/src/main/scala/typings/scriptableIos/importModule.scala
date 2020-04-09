package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("importModule")
@js.native
object importModule extends js.Object {
  /**
    * _Imports module with specified name._
    *
    * Modules are imported by specifying the name of the file. For example, to import the file `foo.js`, call `importModule('foo')`. Including the file extension is optional. Scriptable
    * will look for modules in the following directories, in order:
    *
    * 1.  Relative to the file the module is imported into.
    * 2.  In Scriptables folder in iCloud if you have iCloud Drive enabled. This folder is accessible from the Files app.
    * 3.  In Scriptables "app group" folder which is not accessible to the user but your scripts are stored in this folder if you do not have iCloud Drive enabled.
    * 4.  In Scriptables local folder. This folder is accessible from the Files app.
    *
    * You can specify a file path rather than the name of a file e.g. `importModule('/lib/foo')`. If the path points to a directory, Scriptable will look for a file named `index.js` in
    * the directory.
    *
    * The `importModule` function returns `module.exports` of the imported module.
    *
    * Consider the following file.
    *
    *     let circle = importModule('circle')
    *     let r = 2
    *     let area = circle.area(r)
    *     log('Area of circle: ' + area)
    *
    * The file imports the module `circle.js` which has the following contents.
    *
    *     module.exports.area = (r) => {
    *       return Math.PI * Math.pow(r, 2)
    *     }
    *
    *     module.exports.circumference = (r) => {
    *       return 2 * Math.PI * r
    *     }
    *
    * The `circle.js` module exports the functions `area` and `circumference`.
    *
    * For more information about modules, refer to the documentation on the `module` variable.
    * @see https://docs.scriptable.app/importmodule
    */
  def apply(path: String): js.Any = js.native
}

