organization := "org.scalablytyped"
name := "rsocket-tcp-server"
version := "0.0-dt-20211202Z-953d79"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20211202Z-a05370",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20211202Z-dc788e",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20211202Z-ecb68f",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
