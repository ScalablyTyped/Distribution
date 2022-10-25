package typings.sipJs.mod.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.DigestAuthentication")
@js.native
open class DigestAuthentication protected ()
  extends typings.sipJs.libCoreMod.DigestAuthentication {
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory) = this()
  def this(loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory, ha1: String) = this()
  def this(
    loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory,
    ha1: String,
    username: String
  ) = this()
  def this(loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory, ha1: Unit, username: String) = this()
  def this(
    loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory,
    ha1: String,
    username: String,
    password: String
  ) = this()
  def this(
    loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory,
    ha1: String,
    username: Unit,
    password: String
  ) = this()
  def this(
    loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory,
    ha1: Unit,
    username: String,
    password: String
  ) = this()
  def this(
    loggerFactory: typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory,
    ha1: Unit,
    username: Unit,
    password: String
  ) = this()
}
