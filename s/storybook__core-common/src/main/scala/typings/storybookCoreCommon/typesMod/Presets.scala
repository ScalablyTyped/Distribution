package typings.storybookCoreCommon.typesMod

import typings.babelCore.mod.TransformOptions
import typings.storybookCoreCommon.anon.BabelOptions
import typings.storybookCoreCommon.anon.OptionsbabelOptionsTransf
import typings.storybookCoreCommon.storybookCoreCommonStrings.babel
import typings.storybookCoreCommon.storybookCoreCommonStrings.core
import typings.storybookCoreCommon.storybookCoreCommonStrings.entries
import typings.storybookCoreCommon.storybookCoreCommonStrings.managerEntries
import typings.storybookCoreCommon.storybookCoreCommonStrings.managerWebpack
import typings.storybookCoreCommon.storybookCoreCommonStrings.refs
import typings.storybookCoreCommon.storybookCoreCommonStrings.stories
import typings.storybookCoreCommon.storybookCoreCommonStrings.typescript
import typings.storybookCoreCommon.storybookCoreCommonStrings.webpack
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presets extends StObject {
  
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String): js.Promise[T] = js.native
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String, config: T): js.Promise[T] = js.native
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String, config: T, args: Any): js.Promise[T] = js.native
  @JSName("apply")
  def apply[T /* <: Any */](`extension`: String, config: Unit, args: Any): js.Promise[T] = js.native
  @JSName("apply")
  def apply_babel(`extension`: babel, config: js.Object, args: Any): js.Promise[TransformOptions] = js.native
  @JSName("apply")
  def apply_core(`extension`: core, config: js.Object, args: Any): js.Promise[CoreConfig] = js.native
  @JSName("apply")
  def apply_entries(`extension`: entries, config: js.Array[Any], args: Any): js.Promise[Any] = js.native
  @JSName("apply")
  def apply_managerEntries(`extension`: managerEntries, config: js.Array[Any], args: Any): js.Promise[js.Array[String]] = js.native
  @JSName("apply")
  def apply_managerWebpack(`extension`: managerWebpack, config: js.Object, args: OptionsbabelOptionsTransf): js.Promise[Configuration] = js.native
  @JSName("apply")
  def apply_refs(`extension`: refs, config: js.Array[Any], args: Any): js.Promise[Any] = js.native
  @JSName("apply")
  def apply_stories(`extension`: stories, config: js.Array[Any], args: Any): js.Promise[js.Array[StoriesEntry]] = js.native
  @JSName("apply")
  def apply_typescript(`extension`: typescript, config: TypescriptConfig): js.Promise[TypescriptConfig] = js.native
  @JSName("apply")
  def apply_typescript(`extension`: typescript, config: TypescriptConfig, args: Options): js.Promise[TypescriptConfig] = js.native
  @JSName("apply")
  def apply_webpack(`extension`: webpack, config: js.Object, args: BabelOptions & Any): js.Promise[Configuration] = js.native
}
