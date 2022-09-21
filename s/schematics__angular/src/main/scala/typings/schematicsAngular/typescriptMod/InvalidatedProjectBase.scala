package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidatedProjectBase extends StObject {
  
  /**
    *  To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
    */
  def done(): ExitStatus = js.native
  def done(cancellationToken: Unit, writeFile: Unit, customTransformers: CustomTransformers): ExitStatus = js.native
  def done(cancellationToken: Unit, writeFile: WriteFileCallback): ExitStatus = js.native
  def done(cancellationToken: Unit, writeFile: WriteFileCallback, customTransformers: CustomTransformers): ExitStatus = js.native
  def done(cancellationToken: CancellationToken): ExitStatus = js.native
  def done(cancellationToken: CancellationToken, writeFile: Unit, customTransformers: CustomTransformers): ExitStatus = js.native
  def done(cancellationToken: CancellationToken, writeFile: WriteFileCallback): ExitStatus = js.native
  def done(
    cancellationToken: CancellationToken,
    writeFile: WriteFileCallback,
    customTransformers: CustomTransformers
  ): ExitStatus = js.native
  
  def getCompilerOptions(): CompilerOptions = js.native
  
  def getCurrentDirectory(): java.lang.String = js.native
  
  val kind: InvalidatedProjectKind = js.native
  
  val project: ResolvedConfigFileName = js.native
}
