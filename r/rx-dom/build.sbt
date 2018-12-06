organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20180910Z-e7edfd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-fa4250",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-45a578",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-714f18",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-9bc129",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-a50f0c",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-497cf1",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-205d1d",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-244780",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-7d3dd3",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-083af1",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-4ce50c",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-e4b8f6",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-f54510",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        