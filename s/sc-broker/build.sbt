organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20200519Z-18c748"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-a67397",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-f91099",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-d9c2f6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
