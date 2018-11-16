package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session
  extends nodeLib.eventsMod.EventEmitter {
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
       * Emitted when the client has requested incoming ssh-agent requests be forwarded to them.
       */
  @JSName("on")
  def `on_auth-agent`(
    event: ssh2Lib.ssh2LibStrings.`auth-agent`,
    listener: js.Function2[
      /* accept */ js.Function0[scala.Boolean], 
      /* reject */ js.Function0[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the session has closed.
       */
  @JSName("on")
  def on_close(event: ssh2Lib.ssh2LibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
       * Emitted when the client requested an environment variable to be set for this session.
       */
  @JSName("on")
  def on_env(
    event: ssh2Lib.ssh2LibStrings.env,
    listener: js.Function3[
      /* accept */ js.Function0[scala.Boolean], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ SetEnvInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the client has requested execution of a command string.
       */
  @JSName("on")
  def on_exec(
    event: ssh2Lib.ssh2LibStrings.exec,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ ExecInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  // Session events
  /**
       * Emitted when the client requested allocation of a pseudo-TTY for this session.
       */
  @JSName("on")
  def on_pty(
    event: ssh2Lib.ssh2LibStrings.pty,
    listener: js.Function3[
      /* accept */ js.Function0[scala.Boolean], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ PseudoTtyInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the client has requested the SFTP subsystem.
       */
  @JSName("on")
  def on_sftp(
    event: ssh2Lib.ssh2LibStrings.sftp,
    listener: js.Function2[
      /* accept */ js.Function0[ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStream], 
      /* reject */ js.Function0[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the client has requested an interactive shell.
       */
  @JSName("on")
  def on_shell(
    event: ssh2Lib.ssh2LibStrings.shell,
    listener: js.Function2[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ js.Function0[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the client has sent a POSIX signal.
       */
  @JSName("on")
  def on_signal(
    event: ssh2Lib.ssh2LibStrings.signal,
    listener: js.Function3[
      /* accept */ js.Function0[scala.Boolean], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ SignalInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the client has requested an arbitrary subsystem.
       */
  @JSName("on")
  def on_subsystem(
    event: ssh2Lib.ssh2LibStrings.subsystem,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ SubsystemInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the client reported a change in window dimensions during this session.
       */
  @JSName("on")
  def `on_window-change`(
    event: ssh2Lib.ssh2LibStrings.`window-change`,
    listener: js.Function3[
      /* accept */ js.Function0[scala.Boolean], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ WindowChangeInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted when the client requested X11 forwarding.
       */
  @JSName("on")
  def on_x11(
    event: ssh2Lib.ssh2LibStrings.x11,
    listener: js.Function3[
      /* accept */ js.Function0[scala.Boolean], 
      /* reject */ js.Function0[scala.Boolean], 
      /* info */ X11Info, 
      scala.Unit
    ]
  ): this.type = js.native
}

