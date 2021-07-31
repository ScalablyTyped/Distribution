organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200519Z-35c5ee"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-c64a85",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-120917",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-65d02a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
