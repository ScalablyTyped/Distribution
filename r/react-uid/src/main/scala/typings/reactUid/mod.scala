package typings.reactUid

import typings.react.mod.SFC
import typings.reactUid.contextMod.UIDProps
import typings.reactUid.controlMod.WithPrefix
import typings.reactUid.hooksMod.SeedGenerator
import typings.reactUid.uidcomponentMod.UID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-uid", "UIDConsumer")
  @js.native
  val UIDConsumer: SFC[UIDProps] = js.native
  
  @JSImport("react-uid", "UIDFork")
  @js.native
  val UIDFork: SFC[WithPrefix] = js.native
  
  @JSImport("react-uid", "UIDReset")
  @js.native
  val UIDReset: SFC[WithPrefix] = js.native
  
  @JSImport("react-uid", "UID")
  @js.native
  class UID_ protected () extends UID {
    def this(props: UIDProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIDProps, context: js.Any) = this()
  }
  
  @JSImport("react-uid", "generateUID")
  @js.native
  def generateUID(): js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String] = js.native
  
  @JSImport("react-uid", "uid")
  @js.native
  def uid(item: js.Any): String = js.native
  @JSImport("react-uid", "uid")
  @js.native
  def uid(item: js.Any, index: Double): String = js.native
  
  @JSImport("react-uid", "useUID")
  @js.native
  def useUID(): String = js.native
  
  @JSImport("react-uid", "useUIDSeed")
  @js.native
  def useUIDSeed(): SeedGenerator = js.native
}
