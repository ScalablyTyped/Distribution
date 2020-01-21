package typings.storybookNodeLogger

import org.scalablytyped.runtime.TopLevel
import typings.npmlog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/node-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object colors extends js.Object {
    var blue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ js.Any = js.native
    var gray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ js.Any = js.native
    var green: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ js.Any = js.native
    var orange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ js.Any = js.native
    var pink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ js.Any = js.native
    var purple: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ js.Any = js.native
    var red: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ js.Any = js.native
  }
  
  @js.native
  object instance extends TopLevel[Logger]
  
  @js.native
  object logger extends js.Object {
    def error(message: String): Unit = js.native
    def info(message: String): Unit = js.native
    def line(): Unit = js.native
    def line(count: Double): Unit = js.native
    def plain(message: String): Unit = js.native
    def setLevel(): Unit = js.native
    def setLevel(level: String): Unit = js.native
    def trace(hasMessageTime: AnonMessage): Unit = js.native
    def warn(message: String): Unit = js.native
  }
  
}

